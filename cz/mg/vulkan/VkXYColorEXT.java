package cz.mg.vulkan;

public class VkXYColorEXT extends VkObject {
    public VkXYColorEXT() {
        super(sizeof());
    }

    public VkXYColorEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkXYColorEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkXYColorEXT(VkFloat x, VkFloat y) {
        super(sizeof());
        setX(x);
        setY(y);
    }

    public VkFloat getX() {
        return new VkFloat(getVkMemory(), getX(getVkAddress()));
    }

    
    public void setX(VkFloat x) {
        setX(getVkAddress(), x != null ? x.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getX(long address);
    private static native void setX(long address, long x);

    public VkFloat getY() {
        return new VkFloat(getVkMemory(), getY(getVkAddress()));
    }

    
    public void setY(VkFloat y) {
        setY(getVkAddress(), y != null ? y.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getY(long address);
    private static native void setY(long address, long y);


    public static native long sizeof();

    public static class Array extends VkXYColorEXT implements cz.mg.collections.array.ReadonlyArray<VkXYColorEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkXYColorEXT.sizeof()));
            this.count = count;
        }

        public Array(int count, VkXYColorEXT o){
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
        public VkXYColorEXT get(int i){
            return new VkXYColorEXT(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkXYColorEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VkXYColorEXT.Pointer> {
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

            public Array(VkXYColorEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkXYColorEXT.Pointer get(int i){
                return new VkXYColorEXT.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
