package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDisplayPropertiesKHR.html">khronos documentation</a>
 **/
public class VkDisplayPropertiesKHR extends VkObject {
    public VkDisplayPropertiesKHR() {
        super(sizeof());
    }

    public VkDisplayPropertiesKHR(VkMemory vkmemory) {
        super(sizeof(), vkmemory);
    }

    public VkDisplayPropertiesKHR(VkMemory vkmemory, long vkaddress) {
        super(sizeof(), vkmemory, vkaddress);
    }


    public VkDisplayPropertiesKHR(VkDisplayKHR display, VkChar displayName, VkExtent2D physicalDimensions, VkExtent2D physicalResolution, VkSurfaceTransformFlagsKHR supportedTransforms, VkBool32 planeReorderPossible, VkBool32 persistentContent) {
        super(sizeof());
        setDisplay(display);
        setDisplayName(displayName);
        setPhysicalDimensions(physicalDimensions);
        setPhysicalResolution(physicalResolution);
        setSupportedTransforms(supportedTransforms);
        setPlaneReorderPossible(planeReorderPossible);
        setPersistentContent(persistentContent);
    }

    public VkDisplayKHR getDisplay() {
        return new VkDisplayKHR(getVkMemory(), getDisplay(getVkAddress()));
    }

    public void setDisplay(VkDisplayKHR display) {
        setDisplay(getVkAddress(), display.getVkAddress());
    }

    private static native long getDisplay(long address);
    private static native void setDisplay(long address, long display);

    public VkChar getDisplayName() {
        return new VkChar(getVkMemory(), getDisplayName(getVkAddress()));
    }

    public void setDisplayName(VkChar displayName) {
        setDisplayName(getVkAddress(), displayName.getVkAddress());
    }

    private static native long getDisplayName(long address);
    private static native void setDisplayName(long address, long displayName);

    public VkExtent2D getPhysicalDimensions() {
        return new VkExtent2D(getVkMemory(), getPhysicalDimensions(getVkAddress()));
    }

    public void setPhysicalDimensions(VkExtent2D physicalDimensions) {
        setPhysicalDimensions(getVkAddress(), physicalDimensions.getVkAddress());
    }

    private static native long getPhysicalDimensions(long address);
    private static native void setPhysicalDimensions(long address, long physicalDimensions);

    public VkExtent2D getPhysicalResolution() {
        return new VkExtent2D(getVkMemory(), getPhysicalResolution(getVkAddress()));
    }

    public void setPhysicalResolution(VkExtent2D physicalResolution) {
        setPhysicalResolution(getVkAddress(), physicalResolution.getVkAddress());
    }

    private static native long getPhysicalResolution(long address);
    private static native void setPhysicalResolution(long address, long physicalResolution);

    public VkSurfaceTransformFlagsKHR getSupportedTransforms() {
        return new VkSurfaceTransformFlagsKHR(getVkMemory(), getSupportedTransforms(getVkAddress()));
    }

    public void setSupportedTransforms(VkSurfaceTransformFlagsKHR supportedTransforms) {
        setSupportedTransforms(getVkAddress(), supportedTransforms.getVkAddress());
    }

    private static native long getSupportedTransforms(long address);
    private static native void setSupportedTransforms(long address, long supportedTransforms);

    public VkBool32 getPlaneReorderPossible() {
        return new VkBool32(getVkMemory(), getPlaneReorderPossible(getVkAddress()));
    }

    public void setPlaneReorderPossible(VkBool32 planeReorderPossible) {
        setPlaneReorderPossible(getVkAddress(), planeReorderPossible.getVkAddress());
    }

    private static native long getPlaneReorderPossible(long address);
    private static native void setPlaneReorderPossible(long address, long planeReorderPossible);

    public VkBool32 getPersistentContent() {
        return new VkBool32(getVkMemory(), getPersistentContent(getVkAddress()));
    }

    public void setPersistentContent(VkBool32 persistentContent) {
        setPersistentContent(getVkAddress(), persistentContent.getVkAddress());
    }

    private static native long getPersistentContent(long address);
    private static native void setPersistentContent(long address, long persistentContent);


    public static native long sizeof();

    public static class Array extends VkDisplayPropertiesKHR implements cz.mg.collections.array.ReadonlyArray<VkDisplayPropertiesKHR> {
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
        public VkDisplayPropertiesKHR get(int i){
            return new VkDisplayPropertiesKHR(getVkMemory(), getVkAddress() + sizeof()*i);
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

            public Array(VkDisplayPropertiesKHR[] a) {
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
