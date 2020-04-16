
# ActivityLifeCycle App
Developed a simple app for the activity life cycle flow callbacks . 


# Overview

The app does the following:

App having 2 pages First Page and Second Page which will explain the callback methods of first page and second page in android log cat Log.e(). 

# To achieve this, there are two pages in this app:

# Once application launch and First page display to user callback for first page is :
2020-04-17 00:23:45.801 1294-1294/com.dilip.activitylifecycle E/First Page::  onCreate
2020-04-17 00:23:45.804 1294-1294/com.dilip.activitylifecycle E/First Page::  onStart
2020-04-17 00:23:45.806 1294-1294/com.dilip.activitylifecycle E/First Page::  onResume

MainActivity - Responsible for executing Next Page click event and open the secon page callback for this page.

# Once user click on the next button of first page following methods callback happens:
2020-04-17 00:30:32.898 1294-1294/com.dilip.activitylifecycle E/First Page::  onPause
2020-04-17 00:30:32.968 1294-1294/com.dilip.activitylifecycle E/Second Page::  onCreate
2020-04-17 00:30:32.970 1294-1294/com.dilip.activitylifecycle E/Second Page::  onStart
2020-04-17 00:30:32.970 1294-1294/com.dilip.activitylifecycle E/Second Page::  onResume
2020-04-17 00:30:33.678 1294-1294/com.dilip.activitylifecycle E/First Page::  onStop


SecondActivity - Responsible for open the second page and click event and open the first page.

# Once user click on the back button of second page following methods callback happens:
2020-04-17 00:33:40.303 1294-1294/com.dilip.activitylifecycle E/Second Page::  onPause
2020-04-17 00:33:40.313 1294-1294/com.dilip.activitylifecycle E/First Page::  onRestart
2020-04-17 00:33:40.314 1294-1294/com.dilip.activitylifecycle E/First Page::  onStart
2020-04-17 00:33:40.314 1294-1294/com.dilip.activitylifecycle E/First Page::  onResume
2020-04-17 00:33:41.011 1294-1294/com.dilip.activitylifecycle E/Second Page::  onStop
2020-04-17 00:33:41.012 1294-1294/com.dilip.activitylifecycle E/Second Page::  onDestroy

# Once user click on the prvious button of the second page instead of clicking back button.
2020-04-17 00:35:44.974 1294-1294/com.dilip.activitylifecycle E/Second Page::  onPause
2020-04-17 00:35:44.988 1294-1294/com.dilip.activitylifecycle E/First Page::  onRestart
2020-04-17 00:35:44.989 1294-1294/com.dilip.activitylifecycle E/First Page::  onStart
2020-04-17 00:35:44.989 1294-1294/com.dilip.activitylifecycle E/First Page::  onResume
2020-04-17 00:35:45.750 1294-1294/com.dilip.activitylifecycle E/Second Page::  onStop

Basically here second page is going into backstack so onDestroy method is not calling of second page if you see diffrence 
of the back button click and previous button click.

# If you click on the Resume button of first page 
2020-04-17 00:39:05.120 1294-1294/com.dilip.activitylifecycle E/First Page::  onPause
2020-04-17 00:39:05.537 1294-1294/com.dilip.activitylifecycle E/First Page::  onStop
And if you come back again same page only following callback happens.
2020-04-17 00:39:18.995 1294-1294/com.dilip.activitylifecycle E/First Page::  onRestart
2020-04-17 00:39:19.005 1294-1294/com.dilip.activitylifecycle E/First Page::  onStart
2020-04-17 00:39:19.006 1294-1294/com.dilip.activitylifecycle E/First Page::  onResume

# If you click on the home buuton of the first page then following callback happens.
2020-04-17 00:42:14.909 1294-1294/com.dilip.activitylifecycle E/First Page::  onPause
2020-04-17 00:42:15.510 1294-1294/com.dilip.activitylifecycle E/First Page::  onStop
And come back again the same page then following callback happens.
2020-04-17 00:43:07.672 1294-1294/com.dilip.activitylifecycle E/First Page::  onRestart
2020-04-17 00:43:07.674 1294-1294/com.dilip.activitylifecycle E/First Page::  onStart
2020-04-17 00:43:07.675 1294-1294/com.dilip.activitylifecycle E/First Page::  onResume

# If you clcim the back button of the first page then folowing callback happens.
2020-04-17 00:44:01.806 1294-1294/com.dilip.activitylifecycle E/First Page::  onPause
2020-04-17 00:44:02.404 1294-1294/com.dilip.activitylifecycle E/First Page::  onStop
2020-04-17 00:44:02.405 1294-1294/com.dilip.activitylifecycle E/First Page::  onDestroy

# Libraries
This app leverages android X.


# For Test App
Clone or Download from this repo.
Open downlaoded project in android studio and just run.
