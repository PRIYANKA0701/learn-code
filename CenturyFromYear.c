int centuryFromYear(int year) {
    int s1 = year % 100;
    int s2 = year / 100;
    if(s1==0)
    {
        return s2;
    }
    else
    {
        return s2+1;    
    }
}
