package cz.mg.vulkan;

public class VkDisplayModePropertiesKHR extends VkObject {
    public VkDisplayModePropertiesKHR() {
        super(sizeof());
    }

    protected VkDisplayModePropertiesKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkDisplayModePropertiesKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDisplayModePropertiesKHR(VkPointer pointer) {
        super(pointer);
    }



    public VkDisplayModeKHR getDisplayMode() {
        return new VkDisplayModeKHR(getVkMemory(), getDisplayMode(getVkAddress()));
    }

    
    public void setDisplayMode(VkDisplayModeKHR displayMode) {
        setDisplayMode(getVkAddress(), displayMode != null ? displayMode.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getDisplayMode(long address);
    protected static native void setDisplayMode(long address, long displayMode);

    public VkDisplayModeParametersKHR getParameters() {
        return new VkDisplayModeParametersKHR(getVkMemory(), getParameters(getVkAddress()));
    }

    
    public void setParameters(VkDisplayModeParametersKHR parameters) {
        setParameters(getVkAddress(), parameters != null ? parameters.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getParameters(long address);
    protected static native void setParameters(long address, long parameters);


    public static native long sizeof();

    public static class Array extends VkDisplayModePropertiesKHR implements cz.mg.collections.array.ReadonlyArray<VkDisplayModePropertiesKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDisplayModePropertiesKHR.sizeof()));
            this.count = count;
        }

        public Array(VkDisplayModePropertiesKHR o, int count){
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
        public VkDisplayModePropertiesKHR get(int i){
            return new VkDisplayModePropertiesKHR(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
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
