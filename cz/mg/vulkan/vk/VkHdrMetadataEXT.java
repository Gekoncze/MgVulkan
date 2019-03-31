package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkHdrMetadataEXT.html">khronos documentation</a>
 **/
public class VkHdrMetadataEXT extends VkObject {
    public VkHdrMetadataEXT() {
        super(sizeof());
    }

    public VkHdrMetadataEXT(VkMemory vkmemory) {
        super(sizeof(), vkmemory);
    }

    public VkHdrMetadataEXT(VkMemory vkmemory, long vkaddress) {
        super(sizeof(), vkmemory, vkaddress);
    }


    public VkHdrMetadataEXT(VkStructureType sType, VkObject pNext, VkXYColorEXT displayPrimaryRed, VkXYColorEXT displayPrimaryGreen, VkXYColorEXT displayPrimaryBlue, VkXYColorEXT whitePoint, VkFloat maxLuminance, VkFloat minLuminance, VkFloat maxContentLightLevel, VkFloat maxFrameAverageLightLevel) {
        super(sizeof());
        setSType(sType);
        setPNext(pNext);
        setDisplayPrimaryRed(displayPrimaryRed);
        setDisplayPrimaryGreen(displayPrimaryGreen);
        setDisplayPrimaryBlue(displayPrimaryBlue);
        setWhitePoint(whitePoint);
        setMaxLuminance(maxLuminance);
        setMinLuminance(minLuminance);
        setMaxContentLightLevel(maxContentLightLevel);
        setMaxFrameAverageLightLevel(maxFrameAverageLightLevel);
    }

    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType.getVkAddress());
    }

    private static native long getSType(long address);
    private static native void setSType(long address, long sType);

    public VkObject getPNext() {
        return new VkObject(getVkMemory(), getPNext(getVkAddress()));
    }

    public void setPNext(VkObject pNext) {
        setPNext(getVkAddress(), pNext.getVkAddress());
    }

    private static native long getPNext(long address);
    private static native void setPNext(long address, long pNext);

    public VkXYColorEXT getDisplayPrimaryRed() {
        return new VkXYColorEXT(getVkMemory(), getDisplayPrimaryRed(getVkAddress()));
    }

    public void setDisplayPrimaryRed(VkXYColorEXT displayPrimaryRed) {
        setDisplayPrimaryRed(getVkAddress(), displayPrimaryRed.getVkAddress());
    }

    private static native long getDisplayPrimaryRed(long address);
    private static native void setDisplayPrimaryRed(long address, long displayPrimaryRed);

    public VkXYColorEXT getDisplayPrimaryGreen() {
        return new VkXYColorEXT(getVkMemory(), getDisplayPrimaryGreen(getVkAddress()));
    }

    public void setDisplayPrimaryGreen(VkXYColorEXT displayPrimaryGreen) {
        setDisplayPrimaryGreen(getVkAddress(), displayPrimaryGreen.getVkAddress());
    }

    private static native long getDisplayPrimaryGreen(long address);
    private static native void setDisplayPrimaryGreen(long address, long displayPrimaryGreen);

    public VkXYColorEXT getDisplayPrimaryBlue() {
        return new VkXYColorEXT(getVkMemory(), getDisplayPrimaryBlue(getVkAddress()));
    }

    public void setDisplayPrimaryBlue(VkXYColorEXT displayPrimaryBlue) {
        setDisplayPrimaryBlue(getVkAddress(), displayPrimaryBlue.getVkAddress());
    }

    private static native long getDisplayPrimaryBlue(long address);
    private static native void setDisplayPrimaryBlue(long address, long displayPrimaryBlue);

    public VkXYColorEXT getWhitePoint() {
        return new VkXYColorEXT(getVkMemory(), getWhitePoint(getVkAddress()));
    }

    public void setWhitePoint(VkXYColorEXT whitePoint) {
        setWhitePoint(getVkAddress(), whitePoint.getVkAddress());
    }

    private static native long getWhitePoint(long address);
    private static native void setWhitePoint(long address, long whitePoint);

    public VkFloat getMaxLuminance() {
        return new VkFloat(getVkMemory(), getMaxLuminance(getVkAddress()));
    }

    public void setMaxLuminance(VkFloat maxLuminance) {
        setMaxLuminance(getVkAddress(), maxLuminance.getVkAddress());
    }

    private static native long getMaxLuminance(long address);
    private static native void setMaxLuminance(long address, long maxLuminance);

    public VkFloat getMinLuminance() {
        return new VkFloat(getVkMemory(), getMinLuminance(getVkAddress()));
    }

    public void setMinLuminance(VkFloat minLuminance) {
        setMinLuminance(getVkAddress(), minLuminance.getVkAddress());
    }

    private static native long getMinLuminance(long address);
    private static native void setMinLuminance(long address, long minLuminance);

    public VkFloat getMaxContentLightLevel() {
        return new VkFloat(getVkMemory(), getMaxContentLightLevel(getVkAddress()));
    }

    public void setMaxContentLightLevel(VkFloat maxContentLightLevel) {
        setMaxContentLightLevel(getVkAddress(), maxContentLightLevel.getVkAddress());
    }

    private static native long getMaxContentLightLevel(long address);
    private static native void setMaxContentLightLevel(long address, long maxContentLightLevel);

    public VkFloat getMaxFrameAverageLightLevel() {
        return new VkFloat(getVkMemory(), getMaxFrameAverageLightLevel(getVkAddress()));
    }

    public void setMaxFrameAverageLightLevel(VkFloat maxFrameAverageLightLevel) {
        setMaxFrameAverageLightLevel(getVkAddress(), maxFrameAverageLightLevel.getVkAddress());
    }

    private static native long getMaxFrameAverageLightLevel(long address);
    private static native void setMaxFrameAverageLightLevel(long address, long maxFrameAverageLightLevel);


    public static native long sizeof();

    public static class Array extends VkHdrMetadataEXT implements cz.mg.collections.array.ReadonlyArray<VkHdrMetadataEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*sizeof()));
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
        public VkHdrMetadataEXT get(int i){
            return new VkHdrMetadataEXT(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends Pointer implements cz.mg.collections.array.ReadonlyArray<Pointer> {
            private final int count;

            public Array(int count) {
                super(new VkMemory(count*sizeof()));
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

            public Array(VkHdrMetadataEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public Pointer get(int i){
                return new Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
