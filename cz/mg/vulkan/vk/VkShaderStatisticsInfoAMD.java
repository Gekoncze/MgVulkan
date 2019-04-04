package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkShaderStatisticsInfoAMD.html">khronos documentation</a>
 **/
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


    public VkShaderStatisticsInfoAMD(VkShaderStageFlags shaderStageMask, VkShaderResourceUsageAMD resourceUsage, VkUInt32 numPhysicalVgprs, VkUInt32 numPhysicalSgprs, VkUInt32 numAvailableVgprs, VkUInt32 numAvailableSgprs, VkUInt32 computeWorkGroupSize) {
        super(sizeof());
        setShaderStageMask(shaderStageMask);
        setResourceUsage(resourceUsage);
        setNumPhysicalVgprs(numPhysicalVgprs);
        setNumPhysicalSgprs(numPhysicalSgprs);
        setNumAvailableVgprs(numAvailableVgprs);
        setNumAvailableSgprs(numAvailableSgprs);
        setComputeWorkGroupSize(computeWorkGroupSize);
    }

    public VkShaderStageFlags getShaderStageMask() {
        return new VkShaderStageFlags(getVkMemory(), getShaderStageMask(getVkAddress()));
    }

    
    public void setShaderStageMask(VkShaderStageFlags shaderStageMask) {
        setShaderStageMask(getVkAddress(), shaderStageMask != null ? shaderStageMask.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getShaderStageMask(long address);
    private static native void setShaderStageMask(long address, long shaderStageMask);

    public VkShaderResourceUsageAMD getResourceUsage() {
        return new VkShaderResourceUsageAMD(getVkMemory(), getResourceUsage(getVkAddress()));
    }

    
    public void setResourceUsage(VkShaderResourceUsageAMD resourceUsage) {
        setResourceUsage(getVkAddress(), resourceUsage != null ? resourceUsage.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getResourceUsage(long address);
    private static native void setResourceUsage(long address, long resourceUsage);

    public VkUInt32 getNumPhysicalVgprs() {
        return new VkUInt32(getVkMemory(), getNumPhysicalVgprs(getVkAddress()));
    }

    
    public void setNumPhysicalVgprs(VkUInt32 numPhysicalVgprs) {
        setNumPhysicalVgprs(getVkAddress(), numPhysicalVgprs != null ? numPhysicalVgprs.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getNumPhysicalVgprs(long address);
    private static native void setNumPhysicalVgprs(long address, long numPhysicalVgprs);

    public VkUInt32 getNumPhysicalSgprs() {
        return new VkUInt32(getVkMemory(), getNumPhysicalSgprs(getVkAddress()));
    }

    
    public void setNumPhysicalSgprs(VkUInt32 numPhysicalSgprs) {
        setNumPhysicalSgprs(getVkAddress(), numPhysicalSgprs != null ? numPhysicalSgprs.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getNumPhysicalSgprs(long address);
    private static native void setNumPhysicalSgprs(long address, long numPhysicalSgprs);

    public VkUInt32 getNumAvailableVgprs() {
        return new VkUInt32(getVkMemory(), getNumAvailableVgprs(getVkAddress()));
    }

    
    public void setNumAvailableVgprs(VkUInt32 numAvailableVgprs) {
        setNumAvailableVgprs(getVkAddress(), numAvailableVgprs != null ? numAvailableVgprs.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getNumAvailableVgprs(long address);
    private static native void setNumAvailableVgprs(long address, long numAvailableVgprs);

    public VkUInt32 getNumAvailableSgprs() {
        return new VkUInt32(getVkMemory(), getNumAvailableSgprs(getVkAddress()));
    }

    
    public void setNumAvailableSgprs(VkUInt32 numAvailableSgprs) {
        setNumAvailableSgprs(getVkAddress(), numAvailableSgprs != null ? numAvailableSgprs.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getNumAvailableSgprs(long address);
    private static native void setNumAvailableSgprs(long address, long numAvailableSgprs);

    public VkUInt32 getComputeWorkGroupSize() {
        return new VkUInt32(getVkMemory(), getComputeWorkGroupSize(getVkAddress()));
    }

    
    public void setComputeWorkGroupSize(VkUInt32 computeWorkGroupSize) {
        setComputeWorkGroupSize(getVkAddress(), computeWorkGroupSize != null ? computeWorkGroupSize.getVkAddress() : VkPointer.NULL);
        
    }

    private static native long getComputeWorkGroupSize(long address);
    private static native void setComputeWorkGroupSize(long address, long computeWorkGroupSize);


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
            return new VkShaderStatisticsInfoAMD(getVkMemory(), getVkAddress() + sizeof()*i);
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

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkShaderStatisticsInfoAMD.Pointer get(int i){
                return new VkShaderStatisticsInfoAMD.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
