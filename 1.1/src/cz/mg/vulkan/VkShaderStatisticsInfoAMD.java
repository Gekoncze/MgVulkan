package cz.mg.vulkan;

public class VkShaderStatisticsInfoAMD extends VkObject {
    public VkShaderStatisticsInfoAMD() {
        super(sizeof());
    }

    public VkShaderStatisticsInfoAMD(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkShaderStatisticsInfoAMD(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkShaderStageFlags getShaderStageMask() {
        return new VkShaderStageFlags(getVkMemory(), getShaderStageMask(getVkAddress()));
    }

    
    public void setShaderStageMask(VkShaderStageFlags shaderStageMask) {
        setShaderStageMask(getVkAddress(), shaderStageMask != null ? shaderStageMask.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getShaderStageMaskQ() {
        return getShaderStageMask().getValue();
    }

    public void setShaderStageMask(int shaderStageMask) {
        getShaderStageMask().setValue(shaderStageMask);
    }

    protected static native long getShaderStageMask(long address);
    protected static native void setShaderStageMask(long address, long shaderStageMask);

    public VkShaderResourceUsageAMD getResourceUsage() {
        return new VkShaderResourceUsageAMD(getVkMemory(), getResourceUsage(getVkAddress()));
    }

    
    public void setResourceUsage(VkShaderResourceUsageAMD resourceUsage) {
        setResourceUsage(getVkAddress(), resourceUsage != null ? resourceUsage.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getResourceUsage(long address);
    protected static native void setResourceUsage(long address, long resourceUsage);

    public VkUInt32 getNumPhysicalVgprs() {
        return new VkUInt32(getVkMemory(), getNumPhysicalVgprs(getVkAddress()));
    }

    
    public void setNumPhysicalVgprs(VkUInt32 numPhysicalVgprs) {
        setNumPhysicalVgprs(getVkAddress(), numPhysicalVgprs != null ? numPhysicalVgprs.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getNumPhysicalVgprsQ() {
        return getNumPhysicalVgprs().getValue();
    }

    public void setNumPhysicalVgprs(int numPhysicalVgprs) {
        getNumPhysicalVgprs().setValue(numPhysicalVgprs);
    }

    protected static native long getNumPhysicalVgprs(long address);
    protected static native void setNumPhysicalVgprs(long address, long numPhysicalVgprs);

    public VkUInt32 getNumPhysicalSgprs() {
        return new VkUInt32(getVkMemory(), getNumPhysicalSgprs(getVkAddress()));
    }

    
    public void setNumPhysicalSgprs(VkUInt32 numPhysicalSgprs) {
        setNumPhysicalSgprs(getVkAddress(), numPhysicalSgprs != null ? numPhysicalSgprs.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getNumPhysicalSgprsQ() {
        return getNumPhysicalSgprs().getValue();
    }

    public void setNumPhysicalSgprs(int numPhysicalSgprs) {
        getNumPhysicalSgprs().setValue(numPhysicalSgprs);
    }

    protected static native long getNumPhysicalSgprs(long address);
    protected static native void setNumPhysicalSgprs(long address, long numPhysicalSgprs);

    public VkUInt32 getNumAvailableVgprs() {
        return new VkUInt32(getVkMemory(), getNumAvailableVgprs(getVkAddress()));
    }

    
    public void setNumAvailableVgprs(VkUInt32 numAvailableVgprs) {
        setNumAvailableVgprs(getVkAddress(), numAvailableVgprs != null ? numAvailableVgprs.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getNumAvailableVgprsQ() {
        return getNumAvailableVgprs().getValue();
    }

    public void setNumAvailableVgprs(int numAvailableVgprs) {
        getNumAvailableVgprs().setValue(numAvailableVgprs);
    }

    protected static native long getNumAvailableVgprs(long address);
    protected static native void setNumAvailableVgprs(long address, long numAvailableVgprs);

    public VkUInt32 getNumAvailableSgprs() {
        return new VkUInt32(getVkMemory(), getNumAvailableSgprs(getVkAddress()));
    }

    
    public void setNumAvailableSgprs(VkUInt32 numAvailableSgprs) {
        setNumAvailableSgprs(getVkAddress(), numAvailableSgprs != null ? numAvailableSgprs.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getNumAvailableSgprsQ() {
        return getNumAvailableSgprs().getValue();
    }

    public void setNumAvailableSgprs(int numAvailableSgprs) {
        getNumAvailableSgprs().setValue(numAvailableSgprs);
    }

    protected static native long getNumAvailableSgprs(long address);
    protected static native void setNumAvailableSgprs(long address, long numAvailableSgprs);

    public VkUInt32 getComputeWorkGroupSize() {
        return new VkUInt32(getVkMemory(), getComputeWorkGroupSize(getVkAddress()));
    }

    
    public void setComputeWorkGroupSize(VkUInt32 computeWorkGroupSize) {
        setComputeWorkGroupSize(getVkAddress(), computeWorkGroupSize != null ? computeWorkGroupSize.getVkAddress() : VkPointer.NULL);
        
    }

    protected static native long getComputeWorkGroupSize(long address);
    protected static native void setComputeWorkGroupSize(long address, long computeWorkGroupSize);


    public static native long sizeof();

    public static class Array extends VkShaderStatisticsInfoAMD implements cz.mg.collections.array.ReadonlyArray<VkShaderStatisticsInfoAMD> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkShaderStatisticsInfoAMD.sizeof()));
            this.count = count;
        }

        public Array(int count, VkShaderStatisticsInfoAMD o){
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
        public VkShaderStatisticsInfoAMD get(int i){
            return new VkShaderStatisticsInfoAMD(getVkMemory(), addressAt(i));
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

        public static class Array extends VkShaderStatisticsInfoAMD.Pointer implements cz.mg.collections.array.ReadonlyArray<VkShaderStatisticsInfoAMD.Pointer> {
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

            public Array(VkShaderStatisticsInfoAMD[] a) {
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
            public VkShaderStatisticsInfoAMD.Pointer get(int i){
                return new VkShaderStatisticsInfoAMD.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }

            protected long addressAt(int i){
                return VkPointer.plus(getVkAddress(), sizeof()*i);
            }
        }
    }
}
