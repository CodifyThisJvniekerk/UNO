package crc64f445eef0d015e878;


public class TransitioningContentControl
	extends crc64a5a37c43dff01024.ContentControl
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("ReactiveUI.Uno.TransitioningContentControl, ReactiveUI.Uno", TransitioningContentControl.class, __md_methods);
	}


	public TransitioningContentControl (android.content.Context p0)
	{
		super (p0);
		if (getClass () == TransitioningContentControl.class)
			mono.android.TypeManager.Activate ("ReactiveUI.Uno.TransitioningContentControl, ReactiveUI.Uno", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
