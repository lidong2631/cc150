<<<<<<< HEAD
public int bitRequired(int a, int b) {
	int count = 0;
	for(int c=a^b; c!=0; c=c>>1)
		count+=c&1;
	return count;
}

=======
public int bitRequired(int a, int b) {
	int count = 0;
	for(int c=a^b; c!=0; c=c>>1)
		count+=c&1;
	return count;
}

>>>>>>> 231aada596112e7d62583bef1b008ea64f59cfb7
Note: 简单题 用XOR可以得到那几位不同 再将这些位加起来即可