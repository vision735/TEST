package toom;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

//实现Callable接口是有返回结果的package ibm.com.thread.ExampleCallable.java
public class ExampleCallable implements Callable<Integer> {
	private static int tickt = 100;

	public Integer call() throws Exception {
		if (tickt > 0) {
			sellTicket();
		}
		return tickt; // 返回剩余票数
	}

//售票方法
private void sellTicket() throws Exception{
while (tickt > 0) {
//线程名称
	String name = Thread.currentThread().getName();
//票数相减
	System.out.println("线程名称：" + name + " 票号：" + tickt--);
	}
}
//实现Callable接口创建多线程主程序入口
public static void main(String[] args) throws InterruptedException, ExecutionException {
	FutureTask<Integer> ft = new FutureTask<>(new ExampleCallable ());
	FutureTask<Integer> ft1 = new FutureTask<>(new ExampleCallable ());
	FutureTask<Integer> ft2 = new FutureTask<>(new ExampleCallable ());
	FutureTask<Integer> ft3 = new FutureTask<>(new ExampleCallable ());
	Thread t1=new Thread(ft);
	Thread t2=new Thread(ft1);
	Thread t3=new Thread(ft2);
	Thread t4=new Thread(ft3);
	t1.start();
	t2.start();
	t3.start();
	t4.start();
	System.out.println("返回结果完成"+ft.get());
	System.out.println("返回结果完成"+ft1.get());
	System.out.println("返回结果完成"+ft2.get());
	System.out.println("返回结果完成"+ft3.get());
	}
	}

