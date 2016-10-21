/*
 * Copyright (C) 2013 Andreas Stuetz <andreas.stuetz@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.fchen.slidingtablayout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SuperAwesomeCardFragment extends Fragment {

	private static final String ARG_POSITION = "POSITION";
	private int position;

	public static SuperAwesomeCardFragment newInstance(int position) {
		SuperAwesomeCardFragment f = new SuperAwesomeCardFragment();
		Bundle b = new Bundle();
		b.putInt(ARG_POSITION, position);
		f.setArguments(b);
		return f;
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		position = getArguments().getInt(ARG_POSITION);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View rootView;

		switch (position) {
			case 0:
				rootView = inflater.inflate(R.layout.fragment_auxiliary, container, false);
				break;
			case 1:
				rootView = inflater.inflate(R.layout.fragment_home, container, false);
				break;
			case 2:
				rootView = inflater.inflate(R.layout.fragment_appendix, container, false);
				break;
			case 3:
				rootView = inflater.inflate(R.layout.fragment_help, container, false);
				break;
			case 4:
				rootView = inflater.inflate(R.layout.fragment_about, container, false);
				break;
			default:
				rootView = inflater.inflate(R.layout.fragment_home, container, false);
				break;
		}
		ButterKnife.bind(this, rootView);
		ViewCompat.setElevation(rootView, 50);
		return rootView;
	}
}
