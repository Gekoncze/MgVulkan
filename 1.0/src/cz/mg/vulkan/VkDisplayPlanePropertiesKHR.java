package cz.mg.vulkan;

public class VkDisplayPlanePropertiesKHR extends VkObject {
    public VkDisplayPlanePropertiesKHR() {
        super(sizeof());
    }

    protected VkDisplayPlanePropertiesKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkDisplayPlanePropertiesKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDisplayPlanePropertiesKHR(VkPointer pointer) {
        super(pointer);
    }



    public VkDisplayKHR getCurrentDisplay() {
        return new VkDisplayKHR(getVkMemory(), getCurrentDisplayNative(getVkAddress()));
    }

    
    public void setCurrentDisplay(VkDisplayKHR currentDisplay) {
        setCurrentDisplayNative(getVkAddress(), currentDisplay != null ? currentDisplay.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getCurrentDisplayNative(long address);
    protected static native void setCurrentDisplayNative(long address, long currentDisplay);

    public VkUInt32 getCurrentStackIndex() {
        return new VkUInt32(getVkMemory(), getCurrentStackIndexNative(getVkAddress()));
    }

    
    public void setCurrentStackIndex(VkUInt32 currentStackIndex) {
        setCurrentStackIndexNative(getVkAddress(), currentStackIndex != null ? currentStackIndex.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getCurrentStackIndexQ() {
        return getCurrentStackIndex().getValue();
    }

    public void setCurrentStackIndex(int currentStackIndex) {
        getCurrentStackIndex().setValue(currentStackIndex);
    }

    protected static native long getCurrentStackIndexNative(long address);
    protected static native void setCurrentStackIndexNative(long address, long currentStackIndex);


    public static native long sizeof();

    public static class Array extends VkDisplayPlanePropertiesKHR implements cz.mg.collections.array.ReadonlyArray<VkDisplayPlanePropertiesKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDisplayPlanePropertiesKHR.sizeof()));
            this.count = count;
        }

        public Array(VkDisplayPlanePropertiesKHR o, int count){
            super(o.getVkMemory(), o.getVkAddress());
            this.count = count;
        }

        public Array(VkPointer pointer, int count){
            super(pointer);
            this.count = count;
        }

        protected Array(VkMemory vkmemory, int count) {
            super(vkmemory);
            this.count = count;
        }

        protected Array(VkMemory vkmemory, long vkaddress, int count) {
            super(vkmemory, vkaddress);
            this.count = count;
        }





        @Override
        public int count(){
            return count;
        }

        @Override
        public VkDisplayPlanePropertiesKHR get(int i){
            return new VkDisplayPlanePropertiesKHR(getVkMemory(), address(i));
        }

        protected long address(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
        }

        public static class Array2 extends VkPointer.Array {
            public Array2(int count) {
                super(count);
            }

            protected Array2(VkMemory vkmemory, int count) {
                super(vkmemory, count);
            }

            protected Array2(VkMemory vkmemory, long vkaddress, int count) {
                super(vkmemory, vkaddress, count);
            }
        }
    }
}
