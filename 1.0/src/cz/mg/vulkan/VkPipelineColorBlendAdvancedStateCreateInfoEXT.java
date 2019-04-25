package cz.mg.vulkan;

public class VkPipelineColorBlendAdvancedStateCreateInfoEXT extends VkObject {
    public VkPipelineColorBlendAdvancedStateCreateInfoEXT() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_COLOR_BLEND_ADVANCED_STATE_CREATE_INFO_EXT));
    }

    public VkPipelineColorBlendAdvancedStateCreateInfoEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPipelineColorBlendAdvancedStateCreateInfoEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPipelineColorBlendAdvancedStateCreateInfoEXT(VkPointer pointer) {
        super(pointer);
    }



    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSTypeNative(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSTypeNative(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSTypeQ() {
        return getSType().getValue();
    }

    public void setSType(int sType) {
        getSType().setValue(sType);
    }

    protected static native long getSTypeNative(long address);
    protected static native void setSTypeNative(long address, long sType);

    public VkObject getPNext() {
        return new VkObject(getVkMemory(), getPNextNative(getVkAddress()));
    }

    private VkObject pNext = null;
    public void setPNext(VkObject pNext) {
        setPNextNative(getVkAddress(), pNext != null ? pNext.getVkAddress() : VkPointer.NULL);
        this.pNext = pNext;
    }

    protected static native long getPNextNative(long address);
    protected static native void setPNextNative(long address, long pNext);

    public VkBool32 getSrcPremultiplied() {
        return new VkBool32(getVkMemory(), getSrcPremultipliedNative(getVkAddress()));
    }

    
    public void setSrcPremultiplied(VkBool32 srcPremultiplied) {
        setSrcPremultipliedNative(getVkAddress(), srcPremultiplied != null ? srcPremultiplied.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSrcPremultipliedQ() {
        return getSrcPremultiplied().getValue();
    }

    public void setSrcPremultiplied(int srcPremultiplied) {
        getSrcPremultiplied().setValue(srcPremultiplied);
    }

    protected static native long getSrcPremultipliedNative(long address);
    protected static native void setSrcPremultipliedNative(long address, long srcPremultiplied);

    public VkBool32 getDstPremultiplied() {
        return new VkBool32(getVkMemory(), getDstPremultipliedNative(getVkAddress()));
    }

    
    public void setDstPremultiplied(VkBool32 dstPremultiplied) {
        setDstPremultipliedNative(getVkAddress(), dstPremultiplied != null ? dstPremultiplied.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDstPremultipliedQ() {
        return getDstPremultiplied().getValue();
    }

    public void setDstPremultiplied(int dstPremultiplied) {
        getDstPremultiplied().setValue(dstPremultiplied);
    }

    protected static native long getDstPremultipliedNative(long address);
    protected static native void setDstPremultipliedNative(long address, long dstPremultiplied);

    public VkBlendOverlapEXT getBlendOverlap() {
        return new VkBlendOverlapEXT(getVkMemory(), getBlendOverlapNative(getVkAddress()));
    }

    
    public void setBlendOverlap(VkBlendOverlapEXT blendOverlap) {
        setBlendOverlapNative(getVkAddress(), blendOverlap != null ? blendOverlap.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getBlendOverlapQ() {
        return getBlendOverlap().getValue();
    }

    public void setBlendOverlap(int blendOverlap) {
        getBlendOverlap().setValue(blendOverlap);
    }

    protected static native long getBlendOverlapNative(long address);
    protected static native void setBlendOverlapNative(long address, long blendOverlap);


    public static native long sizeof();

    public static class Array extends VkPipelineColorBlendAdvancedStateCreateInfoEXT implements cz.mg.collections.array.ReadonlyArray<VkPipelineColorBlendAdvancedStateCreateInfoEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPipelineColorBlendAdvancedStateCreateInfoEXT.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_COLOR_BLEND_ADVANCED_STATE_CREATE_INFO_EXT));;
        }

        public Array(int count, VkPipelineColorBlendAdvancedStateCreateInfoEXT o){
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
        public VkPipelineColorBlendAdvancedStateCreateInfoEXT get(int i){
            return new VkPipelineColorBlendAdvancedStateCreateInfoEXT(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
