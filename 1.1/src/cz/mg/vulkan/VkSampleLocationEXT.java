package cz.mg.vulkan;

public class VkSampleLocationEXT extends VkObject {
    public VkSampleLocationEXT() {
        super(sizeof());
    }

    public VkSampleLocationEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSampleLocationEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkFloat getX() {
        return new VkFloat(getVkMemory(), getX(getVkAddress()));
    }

    
    public void setX(VkFloat x) {
        setX(getVkAddress(), x != null ? x.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public float getXQ() {
        return getX().getValue();
    }

    public void setX(float x) {
        getX().setValue(x);
    }

    protected static native long getX(long address);
    protected static native void setX(long address, long x);

    public VkFloat getY() {
        return new VkFloat(getVkMemory(), getY(getVkAddress()));
    }

    
    public void setY(VkFloat y) {
        setY(getVkAddress(), y != null ? y.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public float getYQ() {
        return getY().getValue();
    }

    public void setY(float y) {
        getY().setValue(y);
    }

    protected static native long getY(long address);
    protected static native void setY(long address, long y);


    public static native long sizeof();

    public static class Array extends VkSampleLocationEXT implements cz.mg.collections.array.ReadonlyArray<VkSampleLocationEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSampleLocationEXT.sizeof()));
            this.count = count;
        }

        public Array(int count, VkSampleLocationEXT o){
            super(o.getVkMemory(), o.getVkAddress());
            this.count = count;
        }

        public Array(VkMemory vkmemory, int count) {
            super(vkmemory);
            this.count = count;
        }

        public Array(VkMemory vkmemory, long vkaddress, int count) {
            super(vkmemory, vkaddress);
            this.count = count;
        }





        @Override
        public int count(){
            return count;
        }

        @Override
        public VkSampleLocationEXT get(int i){
            return new VkSampleLocationEXT(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
        }
    }

    public static class Pointer extends VkObject.Pointer {
        public Pointer() {
        }

        public Pointer(long value) {
            setValue(value);
        }

        public Pointer(VkMemory vkmemory) {
            super(vkmemory);
        }

        public Pointer(VkMemory vkmemory, long vkaddress) {
            super(vkmemory, vkaddress);
        }

        public static class Array extends VkSampleLocationEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VkSampleLocationEXT.Pointer> {
            private final int count;

            public Array(int count) {
                super(new VkMemory(count*VkPointer.sizeof()));
                this.count = count;
            }

            public Array(VkMemory vkmemory, int count) {
                super(vkmemory);
                this.count = count;
            }

            public Array(VkMemory vkmemory, long vkaddress, int count) {
                super(vkmemory, vkaddress);
                this.count = count;
            }

            public Array(VkSampleLocationEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            public Array(long... values){
                this(values.length);
                for(int i = 0; i < values.length; i++) setValueAt(i, values[i]);
            }

            public long getValueAt(int i){
                return getValueNative(addressAt(i));
            }

            public void setValueAt(int i, long value){
                setValueNative(addressAt(i), value);
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkSampleLocationEXT.Pointer get(int i){
                return new VkSampleLocationEXT.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }

            protected long addressAt(int i){
                return VkPointer.plus(getVkAddress(), sizeof()*i);
            }
        }
    }
}
