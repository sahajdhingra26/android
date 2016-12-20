package sd.game.cmd;

import java.util.ArrayList;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class database {
	
	public static final String KEY_SCORE = "score";
	public static final String KEY_NAME = "name";

	
	public static final String DATABASE_NAME = "carmegeddon";
	public static final String DATABASE_TABLE = "score";
	public static final int DATABASE_VERSION = 1;
	
	
	private DbHelper ourHelper;
	private final Context ourContext;
	private static SQLiteDatabase ourDatabase;
	
	private static class DbHelper extends SQLiteOpenHelper{

		public DbHelper(Context context){
			super(context, DATABASE_NAME, null, DATABASE_VERSION);

			
		}
		
		@Override
		public void onCreate(SQLiteDatabase db) {
			db.execSQL("CREATE TABLE " + DATABASE_TABLE + " (" + 
			KEY_SCORE + " TEXT, " +
			KEY_NAME + " TEXT)");
		}

		@Override
		public void onUpgrade(SQLiteDatabase db, int arg1, int arg2) {
			// TODO Auto-generated method stub
			db.execSQL("DROP TABLE IF EXISTS " + DATABASE_TABLE);
			onCreate(db);
		}
		
	}
	
	public database(Context c){
		ourContext = c;
	}
	
	public database open() throws SQLException{
		ourHelper = new DbHelper(ourContext);
		ourDatabase = ourHelper.getWritableDatabase();
		
		return this;
	}
	
	public void close(){
		ourHelper.close();
	}

	public long createEntry(String name, String score) {
		ContentValues cv = new ContentValues();
		cv.put(KEY_SCORE, score);
		cv.put(KEY_NAME, name);
		return ourDatabase.insert(DATABASE_TABLE, null, cv);
	}
	
	public String getData() {
		
		Cursor c = ourDatabase.rawQuery("SELECT * FROM "+DATABASE_TABLE+" ORDER BY "+KEY_SCORE+" DESC",null);
		String result = "";
		int iName = c.getColumnIndex(KEY_SCORE);
		int iScore = c.getColumnIndex(KEY_NAME);
		
		for(c.moveToFirst(); !c.isAfterLast(); c.moveToNext()){
			result += c.getString(iScore) + " " + c.getString(iName) + " " + "\n";		}
		return result;
	}
	
	public ArrayList<Score> getScore() {

		ArrayList<Score> sc = new ArrayList<Score>();
		//ourDatabase.execSQL("DELETE * FROM "+DATABASE_TABLE);
		Cursor c = ourDatabase.rawQuery("SELECT * FROM "+DATABASE_TABLE+" ORDER BY "+KEY_SCORE+" DESC",null);

		int iScore = c.getColumnIndex(KEY_SCORE);
		int iName = c.getColumnIndex(KEY_NAME);
		Score s = null;
		for(c.moveToFirst(); !c.isAfterLast(); c.moveToNext()){
			s = new Score();
			s.setName(c.getString(iName));
			s.setScore(c.getString(iScore));
			sc.add(s);
		}
		return sc;
	}
	
}
