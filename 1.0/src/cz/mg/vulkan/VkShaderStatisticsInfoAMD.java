package cz.mg.vulkan;

public class VkShaderStatisticsInfoAMD extends VkObject {
    public VkShaderStatisticsInfoAMD() {
        super(sizeof());
    }

    protected VkShaderStatisticsInfoAMD(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkShaderStatisticsInfoAMD(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkShaderStatisticsInfoAMD(VkPointer pointer) {
        super(pointer);
    }



    public VkShaderStageFlags getShaderStageMask() {
        return new VkShaderStageFlags(getVkMemory(), getShaderStageMaskNative(getVkAddress()));
    }

    
    public void setShaderStageMask(VkShaderStageFlags shaderStageMask) {
        setShaderStageMaskNative(getVkAddress(), shaderStageMask != null ? shaderStageMask.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getShaderStageMaskQ() {
        return getShaderStageMask().getValue();
    }

    public void setShaderStageMask(int shaderStageMask) {
        getShaderStageMask().setValue(shaderStageMask);
    }

    protected static native long getShaderStageMaskNative(long address);
    protected static native void setShaderStageMaskNative(long address, long shaderStageMask);

    public VkShaderResourceUsageAMD getResourceUsage() {
        return new VkShaderResourceUsageAMD(getVkMemory(), getResourceUsageNative(getVkAddress()));
    }

    
    public void setResourceUsage(VkShaderResourceUsageAMD resourceUsage) {
        setResourceUsageNative(getVkAddress(), resourceUsage != null ? resourceUsage.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getResourceUsageNative(long address);
    protected static native void setResourceUsageNative(long address, long resourceUsage);

    public VkUInt32 getNumPhysicalVgprs() {
        return new VkUInt32(getVkMemory(), getNumPhysicalVgprsNative(getVkAddress()));
    }

    
    public void setNumPhysicalVgprs(VkUInt32 numPhysicalVgprs) {
        setNumPhysicalVgprsNative(getVkAddress(), numPhysicalVgprs != null ? numPhysicalVgprs.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getNumPhysicalVgprsQ() {
        return getNumPhysicalVgprs().getValue();
    }

    public void setNumPhysicalVgprs(int numPhysicalVgprs) {
        getNumPhysicalVgprs().setValue(numPhysicalVgprs);
    }

    protected static native long getNumPhysicalVgprsNative(long address);
    protected static native void setNumPhysicalVgprsNative(long address, long numPhysicalVgprs);

    public VkUInt32 getNumPhysicalSgprs() {
        return new VkUInt32(getVkMemory(), getNumPhysicalSgprsNative(getVkAddress()));
    }

    
    public void setNumPhysicalSgprs(VkUInt32 numPhysicalSgprs) {
        setNumPhysicalSgprsNative(getVkAddress(), numPhysicalSgprs != null ? numPhysicalSgprs.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getNumPhysicalSgprsQ() {
        return getNumPhysicalSgprs().getValue();
    }

    public void setNumPhysicalSgprs(int numPhysicalSgprs) {
        getNumPhysicalSgprs().setValue(numPhysicalSgprs);
    }

    protected static native long getNumPhysicalSgprsNative(long address);
    protected static native void setNumPhysicalSgprsNative(long address, long numPhysicalSgprs);

    public VkUInt32 getNumAvailableVgprs() {
        return new VkUInt32(getVkMemory(), getNumAvailableVgprsNative(getVkAddress()));
    }

    
    public void setNumAvailableVgprs(VkUInt32 numAvailableVgprs) {
        setNumAvailableVgprsNative(getVkAddress(), numAvailableVgprs != null ? numAvailableVgprs.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getNumAvailableVgprsQ() {
        return getNumAvailableVgprs().getValue();
    }

    public void setNumAvailableVgprs(int numAvailableVgprs) {
        getNumAvailableVgprs().setValue(numAvailableVgprs);
    }

    protected static native long getNumAvailableVgprsNative(long address);
    protected static native void setNumAvailableVgprsNative(long address, long numAvailableVgprs);

    public VkUInt32 getNumAvailableSgprs() {
        return new VkUInt32(getVkMemory(), getNumAvailableSgprsNative(getVkAddress()));
    }

    
    public void setNumAvailableSgprs(VkUInt32 numAvailableSgprs) {
        setNumAvailableSgprsNative(getVkAddress(), numAvailableSgprs != null ? numAvailableSgprs.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getNumAvailableSgprsQ() {
        return getNumAvailableSgprs().getValue();
    }

    public void setNumAvailableSgprs(int numAvailableSgprs) {
        getNumAvailableSgprs().setValue(numAvailableSgprs);
    }

    protected static native long getNumAvailableSgprsNative(long address);
    protected static native void setNumAvailableSgprsNative(long address, long numAvailableSgprs);

    public VkUInt32 getComputeWorkGroupSize() {
        return new VkUInt32(getVkMemory(), getComputeWorkGroupSizeNative(getVkAddress()));
    }

    
    public void setComputeWorkGroupSize(VkUInt32 computeWorkGroupSize) {
        setComputeWorkGroupSizeNative(getVkAddress(), computeWorkGroupSize != null ? computeWorkGroupSize.getVkAddress() : VkPointer.NULL);
        
    }

    protected static native long getComputeWorkGroupSizeNative(long address);
    protected static native void setComputeWorkGroupSizeNative(long address, long computeWorkGroupSize);


    public void set(VkShaderStatisticsInfoAMD o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkShaderStatisticsInfoAMD implements cz.mg.collections.array.ReadonlyArray<VkShaderStatisticsInfoAMD> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkShaderStatisticsInfoAMD.sizeof()));
            this.count = count;
        }

        public Array(VkShaderStatisticsInfoAMD o, int count){
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
        public VkShaderStatisticsInfoAMD get(int i){
            return new VkShaderStatisticsInfoAMD(getVkMemory(), address(i));
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
