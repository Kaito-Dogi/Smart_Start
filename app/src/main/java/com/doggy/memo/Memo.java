package com.doggy.memo;

import io.realm.RealmObject;

public class Memo extends RealmObject {
    public String title;

    public String updateDate;

    public String content;
}
