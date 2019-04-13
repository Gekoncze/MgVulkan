package cz.mg.vulkan;

public class VkPipelineRasterizationStateCreateInfo extends VkObject {
    public VkPipelineRasterizationStateCreateInfo() {
        super(sizeof());
    }

    public VkPipelineRasterizationStateCreateInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPipelineRasterizationStateCreateInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkPipelineRasterizationStateCreateInfo(VkObject pNext, VkPipelineRasterizationStateCreateFlags flags, VkBool32 depthClampEnable, VkBool32 rasterizerDiscardEnable, VkPolygonMode polygonMode, VkCullModeFlags cullMode, VkFrontFace frontFace, VkBool32 depthBiasEnable, VkFloat depthBiasConstantFactor, VkFloat depthBiasClamp, VkFloat depthBiasSlopeFactor, VkFloat lineWidth) {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_CREATE_INFO));
        setPNext(pNext);
        setFlags(flags);
        setDepthClampEnable(depthClampEnable);
        setRasterizerDiscardEnable(rasterizerDiscardEnable);
        setPolygonMode(polygonMode);
        setCullMode(cullMode);
        setFrontFace(frontFace);
        setDepthBiasEnable(depthBiasEnable);
        setDepthBiasConstantFactor(depthBiasConstantFactor);
        setDepthBiasClamp(depthBiasClamp);
        setDepthBiasSlopeFactor(depthBiasSlopeFactor);
        setLineWidth(lineWidth);
    }

    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getSinkAddress());
        
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

    public VkPipelineRasterizationStateCreateFlags getFlags() {
        return new VkPipelineRasterizationStateCreateFlags(getVkMemory(), getFlags(getVkAddress()));
    }

    
    public void setFlags(VkPipelineRasterizationStateCreateFlags flags) {
        setFlags(getVkAddress(), flags != null ? flags.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getFlags(long address);
    private static native void setFlags(long address, long flags);

    public VkBool32 getDepthClampEnable() {
        return new VkBool32(getVkMemory(), getDepthClampEnable(getVkAddress()));
    }

    
    public void setDepthClampEnable(VkBool32 depthClampEnable) {
        setDepthClampEnable(getVkAddress(), depthClampEnable != null ? depthClampEnable.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getDepthClampEnable(long address);
    private static native void setDepthClampEnable(long address, long depthClampEnable);

    public VkBool32 getRasterizerDiscardEnable() {
        return new VkBool32(getVkMemory(), getRasterizerDiscardEnable(getVkAddress()));
    }

    
    public void setRasterizerDiscardEnable(VkBool32 rasterizerDiscardEnable) {
        setRasterizerDiscardEnable(getVkAddress(), rasterizerDiscardEnable != null ? rasterizerDiscardEnable.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getRasterizerDiscardEnable(long address);
    private static native void setRasterizerDiscardEnable(long address, long rasterizerDiscardEnable);

    public VkPolygonMode getPolygonMode() {
        return new VkPolygonMode(getVkMemory(), getPolygonMode(getVkAddress()));
    }

    
    public void setPolygonMode(VkPolygonMode polygonMode) {
        setPolygonMode(getVkAddress(), polygonMode != null ? polygonMode.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getPolygonMode(long address);
    private static native void setPolygonMode(long address, long polygonMode);

    public VkCullModeFlags getCullMode() {
        return new VkCullModeFlags(getVkMemory(), getCullMode(getVkAddress()));
    }

    
    public void setCullMode(VkCullModeFlags cullMode) {
        setCullMode(getVkAddress(), cullMode != null ? cullMode.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getCullMode(long address);
    private static native void setCullMode(long address, long cullMode);

    public VkFrontFace getFrontFace() {
        return new VkFrontFace(getVkMemory(), getFrontFace(getVkAddress()));
    }

    
    public void setFrontFace(VkFrontFace frontFace) {
        setFrontFace(getVkAddress(), frontFace != null ? frontFace.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getFrontFace(long address);
    private static native void setFrontFace(long address, long frontFace);

    public VkBool32 getDepthBiasEnable() {
        return new VkBool32(getVkMemory(), getDepthBiasEnable(getVkAddress()));
    }

    
    public void setDepthBiasEnable(VkBool32 depthBiasEnable) {
        setDepthBiasEnable(getVkAddress(), depthBiasEnable != null ? depthBiasEnable.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getDepthBiasEnable(long address);
    private static native void setDepthBiasEnable(long address, long depthBiasEnable);

    public VkFloat getDepthBiasConstantFactor() {
        return new VkFloat(getVkMemory(), getDepthBiasConstantFactor(getVkAddress()));
    }

    
    public void setDepthBiasConstantFactor(VkFloat depthBiasConstantFactor) {
        setDepthBiasConstantFactor(getVkAddress(), depthBiasConstantFactor != null ? depthBiasConstantFactor.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getDepthBiasConstantFactor(long address);
    private static native void setDepthBiasConstantFactor(long address, long depthBiasConstantFactor);

    public VkFloat getDepthBiasClamp() {
        return new VkFloat(getVkMemory(), getDepthBiasClamp(getVkAddress()));
    }

    
    public void setDepthBiasClamp(VkFloat depthBiasClamp) {
        setDepthBiasClamp(getVkAddress(), depthBiasClamp != null ? depthBiasClamp.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getDepthBiasClamp(long address);
    private static native void setDepthBiasClamp(long address, long depthBiasClamp);

    public VkFloat getDepthBiasSlopeFactor() {
        return new VkFloat(getVkMemory(), getDepthBiasSlopeFactor(getVkAddress()));
    }

    
    public void setDepthBiasSlopeFactor(VkFloat depthBiasSlopeFactor) {
        setDepthBiasSlopeFactor(getVkAddress(), depthBiasSlopeFactor != null ? depthBiasSlopeFactor.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getDepthBiasSlopeFactor(long address);
    private static native void setDepthBiasSlopeFactor(long address, long depthBiasSlopeFactor);

    public VkFloat getLineWidth() {
        return new VkFloat(getVkMemory(), getLineWidth(getVkAddress()));
    }

    
    public void setLineWidth(VkFloat lineWidth) {
        setLineWidth(getVkAddress(), lineWidth != null ? lineWidth.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getLineWidth(long address);
    private static native void setLineWidth(long address, long lineWidth);


    public static native long sizeof();

    public static class Array extends VkPipelineRasterizationStateCreateInfo implements cz.mg.collections.array.ReadonlyArray<VkPipelineRasterizationStateCreateInfo> {        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPipelineRasterizationStateCreateInfo.sizeof()));
            this.count = count;
        }

        public Array(int count, VkPipelineRasterizationStateCreateInfo o){
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
        public VkPipelineRasterizationStateCreateInfo get(int i){
            return new VkPipelineRasterizationStateCreateInfo(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }


    public static class Pointer extends VkObject.Pointer {        public Pointer() {
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

        public static class Array extends VkPipelineRasterizationStateCreateInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VkPipelineRasterizationStateCreateInfo.Pointer> {
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

            public Array(VkPipelineRasterizationStateCreateInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkPipelineRasterizationStateCreateInfo.Pointer get(int i){
                return new VkPipelineRasterizationStateCreateInfo.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }

}
