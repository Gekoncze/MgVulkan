package cz.mg.vulkan;

public class VkCommandBufferInheritanceInfo extends VkObject {
    public VkCommandBufferInheritanceInfo() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_INFO));
    }

    public VkCommandBufferInheritanceInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkCommandBufferInheritanceInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getSTypeQ() {
        return getSType().getValue();
    }

    public void setSType(int sType) {
        getSType().setValue(sType);
    }

    private static native long getSType(long address);
    private static native void setSType(long address, long sType);

    public VkObject getPNext() {
        return new VkObject(getVkMemory(), getPNext(getVkAddress()));
    }

    private VkObject pNext = null;
    public void setPNext(VkObject pNext) {
        setPNext(getVkAddress(), pNext != null ? pNext.getVkAddress() : VkPointer.NULL);
        this.pNext = pNext;
    }

    private static native long getPNext(long address);
    private static native void setPNext(long address, long pNext);

    public VkRenderPass getRenderPass() {
        return new VkRenderPass(getVkMemory(), getRenderPass(getVkAddress()));
    }

    
    public void setRenderPass(VkRenderPass renderPass) {
        setRenderPass(getVkAddress(), renderPass != null ? renderPass.getVkAddress() : VkPointer.getNullAddress());
        
    }

    private static native long getRenderPass(long address);
    private static native void setRenderPass(long address, long renderPass);

    public VkUInt32 getSubpass() {
        return new VkUInt32(getVkMemory(), getSubpass(getVkAddress()));
    }

    
    public void setSubpass(VkUInt32 subpass) {
        setSubpass(getVkAddress(), subpass != null ? subpass.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getSubpassQ() {
        return getSubpass().getValue();
    }

    public void setSubpass(int subpass) {
        getSubpass().setValue(subpass);
    }

    private static native long getSubpass(long address);
    private static native void setSubpass(long address, long subpass);

    public VkFramebuffer getFramebuffer() {
        return new VkFramebuffer(getVkMemory(), getFramebuffer(getVkAddress()));
    }

    
    public void setFramebuffer(VkFramebuffer framebuffer) {
        setFramebuffer(getVkAddress(), framebuffer != null ? framebuffer.getVkAddress() : VkPointer.getNullAddress());
        
    }

    private static native long getFramebuffer(long address);
    private static native void setFramebuffer(long address, long framebuffer);

    public VkBool32 getOcclusionQueryEnable() {
        return new VkBool32(getVkMemory(), getOcclusionQueryEnable(getVkAddress()));
    }

    
    public void setOcclusionQueryEnable(VkBool32 occlusionQueryEnable) {
        setOcclusionQueryEnable(getVkAddress(), occlusionQueryEnable != null ? occlusionQueryEnable.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getOcclusionQueryEnableQ() {
        return getOcclusionQueryEnable().getValue();
    }

    public void setOcclusionQueryEnable(int occlusionQueryEnable) {
        getOcclusionQueryEnable().setValue(occlusionQueryEnable);
    }

    private static native long getOcclusionQueryEnable(long address);
    private static native void setOcclusionQueryEnable(long address, long occlusionQueryEnable);

    public VkQueryControlFlags getQueryFlags() {
        return new VkQueryControlFlags(getVkMemory(), getQueryFlags(getVkAddress()));
    }

    
    public void setQueryFlags(VkQueryControlFlags queryFlags) {
        setQueryFlags(getVkAddress(), queryFlags != null ? queryFlags.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getQueryFlagsQ() {
        return getQueryFlags().getValue();
    }

    public void setQueryFlags(int queryFlags) {
        getQueryFlags().setValue(queryFlags);
    }

    private static native long getQueryFlags(long address);
    private static native void setQueryFlags(long address, long queryFlags);

    public VkQueryPipelineStatisticFlags getPipelineStatistics() {
        return new VkQueryPipelineStatisticFlags(getVkMemory(), getPipelineStatistics(getVkAddress()));
    }

    
    public void setPipelineStatistics(VkQueryPipelineStatisticFlags pipelineStatistics) {
        setPipelineStatistics(getVkAddress(), pipelineStatistics != null ? pipelineStatistics.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getPipelineStatisticsQ() {
        return getPipelineStatistics().getValue();
    }

    public void setPipelineStatistics(int pipelineStatistics) {
        getPipelineStatistics().setValue(pipelineStatistics);
    }

    private static native long getPipelineStatistics(long address);
    private static native void setPipelineStatistics(long address, long pipelineStatistics);


    public static native long sizeof();

    public static class Array extends VkCommandBufferInheritanceInfo implements cz.mg.collections.array.ReadonlyArray<VkCommandBufferInheritanceInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkCommandBufferInheritanceInfo.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_INFO));;
        }

        public Array(int count, VkCommandBufferInheritanceInfo o){
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
        public VkCommandBufferInheritanceInfo get(int i){
            return new VkCommandBufferInheritanceInfo(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkCommandBufferInheritanceInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VkCommandBufferInheritanceInfo.Pointer> {
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

            public Array(VkCommandBufferInheritanceInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkCommandBufferInheritanceInfo.Pointer get(int i){
                return new VkCommandBufferInheritanceInfo.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
