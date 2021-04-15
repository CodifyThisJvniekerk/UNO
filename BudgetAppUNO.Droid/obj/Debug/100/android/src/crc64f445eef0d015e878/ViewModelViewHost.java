package crc64f445eef0d015e878;


public class ViewModelViewHost
	extends crc64f445eef0d015e878.TransitioningContentControl
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("ReactiveUI.Uno.ViewModelViewHost, ReactiveUI.Uno", ViewModelViewHost.class, __md_methods);
	}


	public ViewModelViewHost (android.content.Context p0)
	{
		super (p0);
		if (getClass () == ViewModelViewHost.class)
			mono.android.TypeManager.Activate ("ReactiveUI.Uno.ViewModelViewHost, ReactiveUI.Uno", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
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
