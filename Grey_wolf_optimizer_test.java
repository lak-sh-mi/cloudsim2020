package Package1;
class f1 extends f_xj//Gold stein f(x)=3.0 @x=(0,-1) -2<x[i]<2 i=1,2
{
double func(double x[])
{
double first=0.0;double second=0.0;
first=(1.0+(x[0]+x[1]+1.0)*(x[0]+x[1]+1.0)*(19.0-14.0*x[0]+3.0*x[0]*x[0]-14.0*x[1]+6.0*x[0]*x[1]+3.0*x[1]*x[1]));	
second=30.0+(2.0*x[0]-3.0*x[1])*(2.0*x[0]-3.0*x[1])*(18.0-32.0*x[0]+12.0*x[0]*x[0]+48.0*x[1]-36.0*x[0]*x[1]+27*x[1]*x[1]);	
return first*second;	
}	
}

class f2 extends f_xj// Beale f(x)=0    @x=(3,0.5)   -4.5<x[i]<4.5, i = 1, 2.
{
double func(double x[])
{
double first=0.0;	
first=((1.5-x[0]+x[0]*x[1])*(1.5-x[0]+x[0]*x[1]))+((2.25-x[0]+x[0]*x[1]*x[1])*(2.25-x[0]+x[0]*x[1]*x[1]))+((2.625-x[0]+x[0]*x[1]*x[1]*x[1])*(2.625-x[0]+x[0]*x[1]*x[1]*x[1]));
return first;	
}	
}

class f3 extends f_xj// Bohachecsky 1 f(x)=0  @x=(0.0,0.0)   -5.0<x[i]<5.0, i = 1, 2.
{
double func(double x[])
{
double first=0.0;	
first=x[0]*x[0]+2.0*x[1]*x[1]-0.3*(Math.cos(Math.PI*3.0*x[0]))-0.4*Math.cos(4.0*Math.PI*x[1])+0.7;
return first;	
}	
}

class f4 extends f_xj// Bohachecsky 2 f(x)=0  @x=(0.0,0.0)   -5.0<x[i]<5.0, i = 1, 2.
{
double func(double x[])
{
double first=0.0;	
first=x[0]*x[0]+2.0*x[1]*x[1]-(0.3*(Math.cos(Math.PI*3.0*x[0]))*Math.cos(4.0*Math.PI*x[1]))+0.3;
return first;	
}	
}

class f5 extends f_xj// Bohachecsky 3 f(x)=0  @x=(0.0,0.0)   -5.0<x[i]<5.0, i = 1, 2.
{
double func(double x[])
{
double first=0.0;	
first=x[0]*x[0]+2.0*x[1]*x[1]-(0.3*(Math.cos(Math.PI*3.0*x[0]+Math.PI*4.0*x[1])))+0.3;
return first;	
}	
}

class f6 extends f_xj// Booth  f(x)=0  @x=(1.0,3.0)   -10.0<x[i]<10.0, i = 1, 2.
{
double func(double x[])
{
double first=0.0;	
first=(x[0]+2.0*x[1]-7.0)*(x[0]+2.0*x[1]-7.0)+(2.0*x[0]+x[1]-5.0)*(2.0*x[0]+x[1]-5.0);
return first;	
}	
}

class f7 extends f_xj// Branin  f(x)=0.397887  @x=(-pi,12.275),(pi,2.275),(9.42478,2.475)   -5.0<=x[0]<=10.0, 0.0<=x[1]<=15.0
{
double func(double x[])
{
double first=0.0;	
first=((x[1]-(5.1*x[0]*x[0]/(4.0*Math.PI*Math.PI))+(5.0*x[0]/Math.PI)-6.0)*(x[1]-(5.1*x[0]*x[0]/(4.0*Math.PI*Math.PI))+(5.0*x[0]/Math.PI)-6.0))+(10.0*(1.0-(1.0/(8.0*3.1415)))*Math.cos(x[0]))+10.0;
return first;	
}	
}

class f8 extends f_xj// Colville  f(x)=0.0  @x=(1,1,1,1)   -10.0<=x[i]<=10.0 i=0,1,2,3
{
double func(double x[])
{
double first=0.0;	
first=(100.0*(x[0]-x[1]*x[1])*(x[0]-x[1]*x[1]))+((1.0-x[0])*(1.0-x[0]))+(90.0*(x[3]-x[2]*x[2])*(x[3]-x[2]*x[2]))+((1.0-x[2])*(1.0-x[2]))+(10.1*((x[1]-1.0)*(x[1]-1.0)+(x[3]-1.0)*(x[3]-1.0)))+(19.8*(x[1]-1.0)*(x[3]-1.0));
return first;	
}	
}

class f9 extends f_xj// Easom  f(x)=-1.0  @x=(pi,pi)   -100.0<=x[i]<=100.0 i=0,1
{
double func(double x[])
{
double first=0.0;	
first=-Math.cos(x[0])*Math.cos(x[1])*Math.exp(-(x[0]-Math.PI)*(x[0]-Math.PI)-(x[1]-Math.PI)*(x[1]-Math.PI));
return first;	
}	
}

class f10 extends f_xj// Himmelblau f(x)=0.0  @x=(3.0,2.0),(-2.8051,3.1313),(-3.7793,-3.2831),(3.5844,-1.8481)   -6.0<=x[i]<=6.0 i=0,1
{
double func(double x[])
{
double first=0.0;	
first=(((x[0]*x[0]+x[1]-11.0)*(x[0]*x[0]+x[1]-11.0))+(x[0]+x[1]*x[1]-7.0)*(x[0]+x[1]*x[1]-7.0));
return first;	
}	
}

class f11 extends f_xj// Griewank f(x)=0.0  @x=(0,0)<---global minima     several local minimas      -600<x[i]<600 i=1,2,.. x.length 
{
double func(double x[])
{
   double s=0.0;
   double fact=1.0;
   int m=x.length;
   for(int i=0;i<m;i++)
   {s+=x[i]*x[i];}	
   for(int i=0;i<m;i++)
   {fact*=Math.cos(x[i]/Math.sqrt(i+1));}
   return (s/4000.0)+1.0+(-fact);	
}	
}

class f23 extends f_xj //Whitley's function         f(x)=0      @x=(0,0,0...) -10<x[i]<10 
{                                              
   double func(double x[])                 
   {
	int n=x.length;
	double s1=0.0;
    for(int i=0;i<n;i++)
    {
	  for(int j=0;j<n;j++)
	  {s1+=(Math.pow((100.0*(x[i]*x[i]-x[j])*(x[i]*x[i]-x[j])+(1.0-x[j])*(1.0-x[j])),2.0)/4000.0)-Math.cos((100.0*(x[i]*x[i]-x[j])*(x[i]*x[i]-x[j])+(1.0-x[j])*(1.0-x[j])))+1.0;}    
	}
	return s1;
  }
}

class f36 extends f_xj //Ackley�s function 2.9        f(x)=0;      @x=(0,0,0...)     -32.768<x[i]<32.768
{
public double func(double x[]) 
{
//��z�m� istenen fonksiyon	
double a=20.0;
double b=0.2;
double c=2.*Math.PI;

int n=x.length;

double r=Math.PI/180;
double top1=0.0;
for(int i=0;i<n;i++)
{top1+=x[i]*x[i];}
top1=Math.sqrt(top1/n);
double top2=0.0;
for(int i=0;i<n;i++)
{top2+=Math.cos(r*c*x[i]);}
top2=top2/n;
double top=-a*Math.exp(-b*top1)-Math.exp(top2)+a+Math.exp(1);
return top;
}
}

class f30 extends f_xj  // Rosenbrock's valley     f(x)=0.0     -2.048<x[i]<2.048
{
double func(double x[]) 
{
//��z�m� istenen fonksiyon	
int n=x.length;
double ff=0.0;
for(int i=0;i<n-1;i++)
{ff+=(100.0*(x[i+1]-x[i]*x[i])*(x[i+1]-x[i]*x[i])+(1.0-x[i])*(1.0-x[i]));}
return ff; 
}
}

class f63 extends f_xj // Generalized Schwefel�s Problem 2.26           
{
public double func(double x[]) 
{
int n=x.length;
double top=0.0;
for(int i=0;i<n;i++)
{
top+=(x[i]*Math.sin(Math.sqrt(Math.abs(x[i]))));
}
return -top;
}
}

class f101 extends f_xj // Alpine  -10.0<x[i]<10.0 f(x)=0  x(0,0,...,0)
{
	double func(double x[])
	{
	int n=x.length;
	double t=0.0;
	for(int i=0;i<n;i++)
	{t+=Math.abs(x[i]*Math.sin(x[i])+0.1*x[i]);}	
	return  t;
	}
}

 

class f29 extends f_xj //Schaffer function         f(x)=0    @x=(0,0,...)  -100<x[i]<100  
{                                              
   double func(double x[])                 
   {
	int n=x.length;
	double s1=0.0;
	for(int i=0;i<n;i++)
	{s1+=x[i]*x[i];}
	double s2=Math.sqrt(s1);
	return 0.5+((Math.pow(Math.sin(s1),2.0)-0.5)/(1.0+0.001*s1));
	}
}

class f34 extends f_xj //Rastrigin�s function 2.5        f(x)=0  @x=(0,0,...)     -5.12<x[i]<5.12
{
public double func(double x[]) 
{
//��z�m� istenen fonksiyon	
double ff=0;
int n=x.length;
for(int i=0;i<n;i++)
{
ff+=10.0+x[i]*x[i]-10*Math.cos(2.0*Math.PI*x[i]);
}
return ff;
}
}

class f1050 extends f_xj  // dropwave  -5.12<x<5.12
{
	double func(double x[])
	{
	int n=x.length;
	double sum=0.0;
	for(int i=0;i<n;i++)
	{sum+=x[i]*x[i];}
	double nom=1.0+Math.cos(12.0*Math.sqrt(sum));
	double sum1=0.0;
	for(int i=0;i<n;i++)
	{sum1+=x[i]*x[i];}
	double denom=0.5*sum1+2.0;
	return -nom/denom;
	
	}
}

class f106 extends f_xj  // Inverted Cosine Wave function,
{
	double func(double x[])
	{
	int n=x.length;
	double t=0.0;
	for(int i=0;i<n-1;i++)
	{t+=Math.exp(-(x[i]*x[i]+x[i+1]*x[i+1]+0.5*x[i]*x[i+1])/8.0)*Math.cos(4.0*Math.sqrt(x[i]*x[i]+x[i+1]*x[i+1]+0.5*x[i]*x[i+1]));}
	return -t;
	}
}



public class   Grey_wolf_optimizer_test
{
    public static void main(String args[])
    {
    
	    //double[] Lower={-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,};//  f23 Whitley
        // double[] Upper={10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0};
	    
          //double[] Lower={-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.120,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,};//  f34 Rastrigin
          //double[] Upper={5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12};
         
            // double[] Lower={-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,};//  f29 schaffer
        //double[] Upper={10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,};
         
      double[] Lower={-2.0,-2.0};// f1 gold stein
      double[] Upper={2.0,2.0};
        
      //double[] Lower={-4.5,-4.5};// f2 beale
      //double[] Upper={4.5,4.5};
      
      //double[] Lower={-5.0,-5.0};// f3 bohac
      //double[] Upper={5.0,5.0};
      
      //double[] Lower={-5.0,-5.0};// f4 bohac
      //double[] Upper={5.0,5.0};
      
       //double[] Lower={-5.0,-5.0,-5.0,-5.0,-5.0,-5.0};// f5 bohac
       //double[] Upper={5.0,5.0,5.0,5.0,5.0,5.0};
      
     // double[] Lower={-10.0,-10.0};// f6 booth
     // double[] Upper={10.0,10.0};
      
     // double[] Lower={-10.0,-10.0,-10.0,-10.0};// f8 collvile
     // double[] Upper={10.0,10.0,10.0,10.0};
       
      //double[] Lower={-6.0,-6.0};// f10 bohac
      //double[] Upper={6.0,6.0};
      
      //double[] Lower={-600.0,-600.0,-600.0,-600.0,-600.0,-600.0,-600.0,-600.0,-600.0,-600.0,-600.0,-600.0,-600.0,-600.0,-600.0,-600.0,-600.0,-600.0,-600.0,-600.0,-600.0,-600.0,-600.0,-600.0,-600.0,-600.0,-600.0,-600.0,-600.0,-600.0};//  f11 griewank
      //double[] Upper={600.0,600.0,600.0,600.0,600.0,600.0,600.0,600.0,600.0,600.0,600.0,600.0,600.0,600.0,600.0,600.0,600.0,600.0,600.0,600.0,600.0,600.0,600.0,600.0,600.0,600.0,600.0,600.0,600.0,600.0};
      
       //double[] Lower={-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12};//  f34 Rastrigin
       //double[] Upper={5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12};
       
      
       //double[] Lower={-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768};//  f36 ackley
       //double[] Upper={32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768};
      
      
       
        //double[] Lower={2.6,0.7,17.0,7.3,7.3,2.9,5.0}; //speed reducer
        //double[] Upper={3.6,0.8,28.0,8.3,8.3,3.9,5.5}; //f77
        
        //double[] Lower={-10.0,-10.0};//f699 
        //double[] Upper={10.0,10.0};//
         //double[] Lower={0.1,1.0,1.0,0.1}; //f76  1.7438 
         //double[] Upper={2.0,10.0,10.0,2.0};
         
         //double[] Lower={0.0,0.0};//f73 
        //double[] Upper={1.0,1.0};//
         
         //double[] Lower={0.0,0.25,2.00};//f75 
         //double[] Upper={2.0,1.30,15.00};//
        
                     
                    //double[] Lower={-2.0,-2.0,-2.0,-2.0,-2.0};   //const_f496--
                   //double[] Upper={2.0,2.0,2.0,2.0,2.0};   
         
                   //double[] Lower={5.49e-6,2.196e-3};   //const_f497--
                   //double[] Upper={4.553,18.21 }; 
                  
                  
                  //double[] Lower={0.0,0.0 };   //const_f498++
                  //double[] Upper={10.0,10.0 }; 
                  
                  
                 // double[] Lower={0.0,0.0 };   //const_f499++
                 // double[] Upper={10.0,10.0 }; 
                  
                  
                  //double[] Lower={-3.5,-3.5 };   //const_f500++
                  //double[] Upper={2.5,2.5 }; 
                  
                   //double[] Lower={-5.0,-1.0,-5.0 };   //const_f501++
                   //double[] Upper={5.0,3.0,5.0 }; 
                  
                   //double[] Lower={-2.0,1.0 };   //const_f502++
                  //double[] Upper={2.0,6.0 }; 
                  
                   //double[] Lower={0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0 };   //const_f503++
                   //double[] Upper={1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0 };
                  
                   //double[] Lower={0.0,0.0,0.0,0.0};   //const_f505++
                   //double[] Upper={1.0,1.0,1.0,1.0};
                  
                   //double[] Lower={0.0,0.0,0.0};   //const_f506
                   //double[] Upper={50.0,50.0,50.0};
                  
                   //double[] Lower={3.0,2.0,0.5};   //const_f507++
                   //double[] Upper={5.0,4.0,2.0};
                   
                  //double[] Lower={-5.0,-5.0};   //const_f508++
                  //double[] Upper={5.0,5.0};
                  
                    //double[] Lower={-1.0,-1.0,-1.0,-1.0,-1.0,-1.0};   //const_f509++
                    //double[] Upper={1.0,1.0,1.0,1.0,1.0,1.0};
                    
                    //double[] Lower={0.25,1.5,};   //const_f510++
                    //double[] Upper={1.0,2.0*Math.PI};
                  
                     //double[] Lower={-1.0,-1.0,-1.0,-1.0,-1.0,-1.0,-1.0,-1.0};   //const_f511++
                     //double[] Upper={1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0};
                  
                     //double[] Lower={-1.0,-1.0,-1.0,-1.0,-1.0,-1.0,-1.0,-1.0,-1.0,-1.0};   //const_f512++
                     //double[] Upper={1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0};
                     
                      //double[] Lower={-5.0,-5.0,-5.0,-5.0,-5.0};   //const_f513--
                      //double[] Upper={5.0,5.0,5.0,5.0,5.0}; 
                     
                      //double[] Lower={-3.0,-3.0,-3.0,-3.0,-3.0,-3.0,-3.0,-3.0,-3.0,-3.0};   //const_f514--
                      //double[] Upper={3.0,3.0,3.0,3.0,3.0,3.0,3.0,3.0,3.0,3.0}; 
                     
                      //double[] Lower={0.0,0.0};   //const_f515++
                      //double[] Upper={1.0,1.0};
                      
                      //double[] Lower={-3.0,-3.0,-3.0,-3.0,-3.0,-3.0,};  //const_f516-- 
                      //double[] Upper={3.0,3.0,3.0,3.0,3.0,3.0,};
                     
                       //double[] Lower={0.0,0.0};   //const_f517++
                       //double[] Upper={2.0*Math.PI,2.0*Math.PI};
                      
                      //double[] Lower={-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0};   //const_f518--
                      //double[] Upper={10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0}; 
                      
                      //double[] Lower={-5.0,-5.0};   //const_f519
                      //double[] Upper={5.0,5.0};
                      
                      
                      //double[] Lower={0.06,0.06,0.06};   //const_f520++
                      //double[] Upper={1.0,1.0,1.0};
         
                       //double[] Lower={-2.048,-2.048,-2.0480,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.0480,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.0480,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.0480,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048};//  f30 Rosenbrock
       //double[] Upper={2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048};
       
       
       //Unimodal
        // f31 Sphere
        //double[] Lower={-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12};//  f31 sphere
        //double[] Upper={5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12 };
        // f27 Schfewel 2.22
        //double[] Lower={-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,};//  f11 griewank
        //double[] Upper={10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,};
        // f30 Rosenbrock //
        //double[] Lower={-2.048,-2.048,-2.0480,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.0480,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.0480,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048};//  f30 Rosenbrock
        //double[] Upper={2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048};
        //f40 step 
        //double[] Lower={-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,};//  f40 step
        //double[] Upper={5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0};
         // f25 quartic//
        //double[] Lower={-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0};//  f11 griewank
        //double[] Upper={10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0 };
         // f63 Generalized Schwefel�s Problem 2.26
         //double[] Lower={-500.0,-500.0,-500.0,-500.0,-500.0,-500.0,-500.0,-500.0,-500.0,-500.0,-500.0,-500.0,-500.0,-500.0,-500.0,-500.0,-500.0,-500.0,-500.0,-500.0,-500.0,-500.0,-500.0,-500.0,-500.0,-500.0,-500.0,-500.0,-500.0,-500.0};//  f11 griewank
         //double[] Upper={500.0,500.0,500.0,500.0,500.0,500.0,500.0,500.0,500.0,500.0,500.0,500.0,500.0,500.0,500.0,500.0,500.0,500.0,500.0,500.0,500.0,500.0,500.0,500.0,500.0,500.0,500.0,500.0,500.0,500.0 };
         // f34 Rastrigin
         //double[] Lower={-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12};//  f34 Rastrigin
         //double[] Upper={5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12};
          //36 ackley
         //double[] Lower={-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768};//  f36 ackley
         //double[] Upper={32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768};
		  // f11 griewank
            // double[] Lower={-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,};//  f11 griewank
            // double[] Upper={10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0};
           //f41 penal1
             //double[] Lower={-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,};//  f41 Penalized
             //double[] Upper={5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0};
            //f42 penal2
             //double[] Lower={-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,};//  f41 Penalized
             //double[] Upper={5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0};
            // f101 alpine//
            // double[] Lower={-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0};//  f11 griewank
            // double[] Upper={10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0 };
             //f106 inverted cosine
               //double[] Lower={-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,};//  f40 step
               //double[] Upper={5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0};
             //f107 pathologic
               //double[] Lower={-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,};//  f40 step
               //double[] Upper={5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0};
              //f108 Salomon
               //double[] Lower={-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,};//  f40 step
               //double[] Upper={5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0};
                //f19 zakharov
             //double[] Lower={-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0};//  f19 Zakharov
             //double[] Upper={10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0};                  
                 //f20 levy                
             //double[] Lower={-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,};//  f20 levy
             //double[] Upper={10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,};
                                                         
       
              //////////// 50D
             //f20 levy                
             //double[] Lower={-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,};//  f20 levy
             //double[] Upper={10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,};
             //f40 step 
             //double[] Lower={-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,};//  f40 step
             //double[] Upper={5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,};
             //f41 penal1
             //double[] Lower={-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,};//  f41 Penalized
             //double[] Upper={5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0,};
             //f19 zakharov//
             //double[] Lower={-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,};//  f19 Zakharov
             //double[] Upper={10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,};                  
             //f36 ackley //
             //double[] Lower={-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768};//  f36 ackley
             //double[] Upper={32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768};
		     //f8 collvile
		     //double[] Lower={-10.0,-10.0,-10.0,-10.0}; //f8 colville
             //double[] Upper={10.0,10.0,10.0,10.0};   
             // f11 griewank
              //double[] Lower={-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0};//  f11 griewank
              //double[] Upper={10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0};
             // f34 Rastrigin //
             //double[] Lower={-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12};//  f34 Rastrigin
             //double[] Upper={5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12};
             // f30 Rosenbrock //
             //double[] Lower={-2.048,-2.048,-2.0480,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.0480,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.0480,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.0480,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048};//  f30 Rosenbrock
             //double[] Upper={2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048, 2.048, 2.048, 2.0480, 2.048, 2.048, 2.048, 2.048, 2.048, 2.048, 2.048};
             // f31 Sphere//
             //double[] Lower={-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12};//  f31 sphere
             //double[] Upper={5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12 };
             // f37 Dropwave//
             //double[] Lower={-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12};//  f31 sphere
             //double[] Upper={5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12 };
             // f80 Schwefel
             //double[] Lower={-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500};//  f31 sphere
             //double[] Upper={500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500, 500, 500, 500, 500, 5000, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500 };
             // f25 quartic//
              //double[] Lower={-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0};//  f11 griewank
              //double[] Upper={10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0};
             
             
             
         
       int maxiter=10000; 
	       int N=20; 
 
	       f1 ff=new f1();
 
           
            Grey_wolf_optimizer qbpso=new  Grey_wolf_optimizer(ff,Lower,Upper,maxiter,N);
           long startTime = System.currentTimeMillis();
           qbpso.toStringnew();
            long endTime   = System.currentTimeMillis();
       long totalTime = endTime - startTime;
       System.out.println((totalTime/1000.0)+" sec");
 
  }

}