User launched the app:

    me.shkschneider.lifecycle V/LifeCycle:MainActivity: init
    me.shkschneider.lifecycle V/LifeCycle:MainActivity: attachBaseContext
    me.shkschneider.lifecycle V/LifeCycle:MainActivity: onCreate: false
    me.shkschneider.lifecycle V/LifeCycle:MainFragment: init
    me.shkschneider.lifecycle V/LifeCycle:MainFragment: onAttach
    me.shkschneider.lifecycle V/LifeCycle:MainViewModel: init @me.shkschneider.lifecycle.MainViewModel@a4ea6fb
    me.shkschneider.lifecycle V/LifeCycle:MainViewModel: tag LifeCycle:MainFragment
    me.shkschneider.lifecycle V/LifeCycle:MainFragment: onCreate: false
    me.shkschneider.lifecycle V/LifeCycle:MainFragment: onCreateView
    me.shkschneider.lifecycle V/LifeCycle:CustomView: init
    me.shkschneider.lifecycle V/LifeCycle:MainFragment: onViewCreated: false
    me.shkschneider.lifecycle V/LifeCycle:MainActivity: onStart
    me.shkschneider.lifecycle V/LifeCycle:MainFragment: onActivityCreated: false
    me.shkschneider.lifecycle V/LifeCycle:MainFragment: onViewStateRestored: false
    me.shkschneider.lifecycle V/LifeCycle:MainFragment: onStart
    me.shkschneider.lifecycle V/LifeCycle:MainActivity: onResume
    me.shkschneider.lifecycle V/LifeCycle:MainActivity: onResumeFragments
    me.shkschneider.lifecycle V/LifeCycle:MainFragment: onResume
    me.shkschneider.lifecycle V/LifeCycle:CustomView: onAttachedToWindow

User clicked on home:

    me.shkschneider.lifecycle V/LifeCycle:MainActivity: onPause
    me.shkschneider.lifecycle V/LifeCycle:MainFragment: onPause
    me.shkschneider.lifecycle V/LifeCycle:MainActivity: onStop
    me.shkschneider.lifecycle V/LifeCycle:MainFragment: onStop
    me.shkschneider.lifecycle V/LifeCycle:MainActivity: onSaveInstanceState
    me.shkschneider.lifecycle V/LifeCycle:MainFragment: onSaveInstanceState

User switched back to app from tasks:

    me.shkschneider.lifecycle V/LifeCycle:MainActivity: onRestart
    me.shkschneider.lifecycle V/LifeCycle:MainActivity: onStart
    me.shkschneider.lifecycle V/LifeCycle:MainFragment: onStart
    me.shkschneider.lifecycle V/LifeCycle:MainActivity: onResume
    me.shkschneider.lifecycle V/LifeCycle:MainActivity: onResumeFragments
    me.shkschneider.lifecycle V/LifeCycle:MainFragment: onResume

User clicked "restart":

    me.shkschneider.lifecycle V/LifeCycle:MainActivity: onPause
    me.shkschneider.lifecycle V/LifeCycle:MainFragment: onPause
    me.shkschneider.lifecycle V/LifeCycle:MainActivity: onStop
    me.shkschneider.lifecycle V/LifeCycle:MainFragment: onStop
    me.shkschneider.lifecycle V/LifeCycle:MainActivity: onSaveInstanceState
    me.shkschneider.lifecycle V/LifeCycle:MainFragment: onSaveInstanceState
    me.shkschneider.lifecycle V/LifeCycle:MainActivity: onDestroy
    me.shkschneider.lifecycle V/LifeCycle:MainFragment: onDestroyView
    me.shkschneider.lifecycle V/LifeCycle:MainFragment: onDestroy
    me.shkschneider.lifecycle V/LifeCycle:MainFragment: onDetach
    me.shkschneider.lifecycle V/LifeCycle:CustomView: onDetachedFromWindow
    me.shkschneider.lifecycle V/LifeCycle:MainActivity: init
    me.shkschneider.lifecycle V/LifeCycle:MainActivity: attachBaseContext
    me.shkschneider.lifecycle V/LifeCycle:MainActivity: onCreate: true
    me.shkschneider.lifecycle V/LifeCycle:MainFragment: init
    me.shkschneider.lifecycle V/LifeCycle:MainFragment: onAttach
    me.shkschneider.lifecycle V/LifeCycle:MainViewModel: tag LifeCycle:MainFragment
    me.shkschneider.lifecycle V/LifeCycle:MainFragment: onCreate: true
    me.shkschneider.lifecycle V/LifeCycle:MainFragment: onCreateView
    me.shkschneider.lifecycle V/LifeCycle:CustomView: init
    me.shkschneider.lifecycle V/LifeCycle:MainFragment: onViewCreated: true
    me.shkschneider.lifecycle V/LifeCycle:MainActivity: onStart
    me.shkschneider.lifecycle V/LifeCycle:MainFragment: onActivityCreated: true
    me.shkschneider.lifecycle V/LifeCycle:MainFragment: onViewStateRestored: true
    me.shkschneider.lifecycle V/LifeCycle:MainFragment: onStart
    me.shkschneider.lifecycle V/LifeCycle:MainActivity: onRestoreInstanceState: true
    me.shkschneider.lifecycle V/LifeCycle:MainActivity: onResume
    me.shkschneider.lifecycle V/LifeCycle:MainActivity: onResumeFragments
    me.shkschneider.lifecycle V/LifeCycle:MainFragment: onResume
    me.shkschneider.lifecycle V/LifeCycle:CustomView: onAttachedToWindow

User clicked "finish":

    me.shkschneider.lifecycle V/LifeCycle:MainActivity: onPause
    me.shkschneider.lifecycle V/LifeCycle:MainFragment: onPause
    me.shkschneider.lifecycle V/LifeCycle:MainActivity: onStop
    me.shkschneider.lifecycle V/LifeCycle:MainFragment: onStop
    me.shkschneider.lifecycle V/LifeCycle:MainActivity: onDestroy
    me.shkschneider.lifecycle V/LifeCycle:MainFragment: onDestroyView
    me.shkschneider.lifecycle V/LifeCycle:MainFragment: onDestroy
    me.shkschneider.lifecycle V/LifeCycle:MainFragment: onDetach
    me.shkschneider.lifecycle V/LifeCycle:CustomView: onDetachedFromWindow
