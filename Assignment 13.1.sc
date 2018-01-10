def gcd(a: Int,b: Int): Int = {
    if (a == 0 || b == 0){
      0
    }else if(a==b){
      a
    }else if(a>b) {
      gcd(a-b, b);
    }else{
      gcd(a, b-a);
    }
}

println("GCD of Two Numbers :"+ gcd(36,60))
