package cz.mg.vulkan;

public class VkSurfaceFormatKHR extends VkObject {
    public VkSurfaceFormatKHR() {
        super(sizeof());
    }

    public VkSurfaceFormatKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSurfaceFormatKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkFormat getFormat() {
        return new VkFormat(getVkMemory(), getFormat(getVkAddress()));
    }

    
    public void setFormat(VkFormat format) {
        setFormat(getVkAddress(), format != null ? format.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getFormatQ() {
        return getFormat().getValue();
    }

    public void setFormat(int format) {
        getFormat().setValue(format);
    }

    protected static native long getFormat(long address);
    protected static native void setFormat(long address, long format);

    public VkColorSpaceKHR getColorSpace() {
        return new VkColorSpaceKHR(getVkMemory(), getColorSpace(getVkAddress()));
    }

    
    public void setColorSpace(VkColorSpaceKHR colorSpace) {
        setColorSpace(getVkAddress(), colorSpace != null ? colorSpace.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getColorSpaceQ() {
        return getColorSpace().getValue();
    }

    public void setColorSpace(int colorSpace) {
        getColorSpace().setValue(colorSpace);
    }

    protected static native long getColorSpace(long address);
    protected static native void setColorSpace(long address, long colorSpace);


    public static native long sizeof();

    public static class Array extends VkSurfaceFormatKHR implements cz.mg.collections.array.ReadonlyArray<VkSurfaceFormatKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSurfaceFormatKHR.sizeof()));
            this.count = count;
        }

        public Array(int count, VkSurfaceFormatKHR o){
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
        public VkSurfaceFormatKHR get(int i){
            return new VkSurfaceFormatKHR(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkSurfaceFormatKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VkSurfaceFormatKHR.Pointer> {
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

            public Array(VkSurfaceFormatKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkSurfaceFormatKHR.Pointer get(int i){
                return new VkSurfaceFormatKHR.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
