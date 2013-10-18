package snippet;

public class Snippet {
	<activity android:name="com.google.zxing.client.android.CaptureActivity"
	   android:screenOrientation="landscape"
	   android:configChanges="orientation|keyboardHidden"
	   android:theme="@android:style/Theme.NoTitleBar.Fullscreen"
	   android:windowSoftInputMode="stateAlwaysHidden">
	   <intent-filter>
	      <action android:name="android.intent.action.MAIN"/>
	      <category android:name="android.intent.category.DEFAULT"/>
	   </intent-filter>
	   <intent-filter>
	      <action android:name="com.google.zxing.client.android.SCAN"/>
	      <category android:name="android.intent.category.DEFAULT"/>
	    </intent-filter>
	</activity>
}

