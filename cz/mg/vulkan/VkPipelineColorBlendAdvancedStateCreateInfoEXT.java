package cz.mg.vulkan;

public class VkPipelineColorBlendAdvancedStateCreateInfoEXT extends VkObject {
    public VkPipelineColorBlendAdvancedStateCreateInfoEXT() {
        super(sizeof());
    }

    public VkPipelineColorBlendAdvancedStateCreateInfoEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPipelineColorBlendAdvancedStateCreateInfoEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPipelineColorBlendAdvancedStateCreateInfoEXT(VkObject pNext, VkBool32 srcPremultiplied, VkBool32 dstPremultiplied, VkBlendOverlapEXT blendOverlap) {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_COLOR_BLEND_ADVANCED_STATE_CREATE_INFO_EXT));
        setPNext(pNext);
        setSrcPremultiplied(srcPremultiplied);
        setDstPremultiplied(dstPremultiplied);
        setBlendOverlap(blendOverlap);
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

    public VkBool32 getSrcPremultiplied() {
        return new VkBool32(getVkMemory(), getSrcPremultiplied(getVkAddress()));
    }

    
    public void setSrcPremultiplied(VkBool32 srcPremultiplied) {
        setSrcPremultiplied(getVkAddress(), srcPremultiplied != null ? srcPremultiplied.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getSrcPremultiplied(long address);
    private static native void setSrcPremultiplied(long address, long srcPremultiplied);

    public VkBool32 getDstPremultiplied() {
        return new VkBool32(getVkMemory(), getDstPremultiplied(getVkAddress()));
    }

    
    public void setDstPremultiplied(VkBool32 dstPremultiplied) {
        setDstPremultiplied(getVkAddress(), dstPremultiplied != null ? dstPremultiplied.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getDstPremultiplied(long address);
    private static native void setDstPremultiplied(long address, long dstPremultiplied);

    public VkBlendOverlapEXT getBlendOverlap() {
        return new VkBlendOverlapEXT(getVkMemory(), getBlendOverlap(getVkAddress()));
    }

    
    public void setBlendOverlap(VkBlendOverlapEXT blendOverlap) {
        setBlendOverlap(getVkAddress(), blendOverlap != null ? blendOverlap.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getBlendOverlap(long address);
    private static native void setBlendOverlap(long address, long blendOverlap);


    public static native long sizeof();

    public static class Array extends VkPipelineColorBlendAdvancedStateCreateInfoEXT implements cz.mg.collections.array.ReadonlyArray<VkPipelineColorBlendAdvancedStateCreateInfoEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPipelineColorBlendAdvancedStateCreateInfoEXT.sizeof()));
            this.count = count;
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

        public static class Array extends VkPipelineColorBlendAdvancedStateCreateInfoEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VkPipelineColorBlendAdvancedStateCreateInfoEXT.Pointer> {
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

            public Array(VkPipelineColorBlendAdvancedStateCreateInfoEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkPipelineColorBlendAdvancedStateCreateInfoEXT.Pointer get(int i){
                return new VkPipelineColorBlendAdvancedStateCreateInfoEXT.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
