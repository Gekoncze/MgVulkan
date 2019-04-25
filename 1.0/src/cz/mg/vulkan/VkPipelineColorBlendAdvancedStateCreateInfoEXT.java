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



    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSTypeQ() {
        return getSType().getValue();
    }

    public void setSType(int sType) {
        getSType().setValue(sType);
    }

    protected static native long getSType(long address);
    protected static native void setSType(long address, long sType);

    public VkObject getPNext() {
        return new VkObject(getVkMemory(), getPNext(getVkAddress()));
    }

    private VkObject pNext = null;
    public void setPNext(VkObject pNext) {
        setPNext(getVkAddress(), pNext != null ? pNext.getVkAddress() : VkPointer.NULL);
        this.pNext = pNext;
    }

    protected static native long getPNext(long address);
    protected static native void setPNext(long address, long pNext);

    public VkBool32 getSrcPremultiplied() {
        return new VkBool32(getVkMemory(), getSrcPremultiplied(getVkAddress()));
    }

    
    public void setSrcPremultiplied(VkBool32 srcPremultiplied) {
        setSrcPremultiplied(getVkAddress(), srcPremultiplied != null ? srcPremultiplied.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSrcPremultipliedQ() {
        return getSrcPremultiplied().getValue();
    }

    public void setSrcPremultiplied(int srcPremultiplied) {
        getSrcPremultiplied().setValue(srcPremultiplied);
    }

    protected static native long getSrcPremultiplied(long address);
    protected static native void setSrcPremultiplied(long address, long srcPremultiplied);

    public VkBool32 getDstPremultiplied() {
        return new VkBool32(getVkMemory(), getDstPremultiplied(getVkAddress()));
    }

    
    public void setDstPremultiplied(VkBool32 dstPremultiplied) {
        setDstPremultiplied(getVkAddress(), dstPremultiplied != null ? dstPremultiplied.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDstPremultipliedQ() {
        return getDstPremultiplied().getValue();
    }

    public void setDstPremultiplied(int dstPremultiplied) {
        getDstPremultiplied().setValue(dstPremultiplied);
    }

    protected static native long getDstPremultiplied(long address);
    protected static native void setDstPremultiplied(long address, long dstPremultiplied);

    public VkBlendOverlapEXT getBlendOverlap() {
        return new VkBlendOverlapEXT(getVkMemory(), getBlendOverlap(getVkAddress()));
    }

    
    public void setBlendOverlap(VkBlendOverlapEXT blendOverlap) {
        setBlendOverlap(getVkAddress(), blendOverlap != null ? blendOverlap.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getBlendOverlapQ() {
        return getBlendOverlap().getValue();
    }

    public void setBlendOverlap(int blendOverlap) {
        getBlendOverlap().setValue(blendOverlap);
    }

    protected static native long getBlendOverlap(long address);
    protected static native void setBlendOverlap(long address, long blendOverlap);


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
