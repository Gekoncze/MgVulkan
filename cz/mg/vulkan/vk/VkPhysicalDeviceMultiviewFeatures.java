package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPhysicalDeviceMultiviewFeatures.html">khronos documentation</a>
 **/
public class VkPhysicalDeviceMultiviewFeatures extends VkObject {
    public VkPhysicalDeviceMultiviewFeatures() {
        super(sizeof());
    }

    public VkPhysicalDeviceMultiviewFeatures(VkMemory vkmemory) {
        super(sizeof(), vkmemory);
    }

    public VkPhysicalDeviceMultiviewFeatures(VkMemory vkmemory, long vkaddress) {
        super(sizeof(), vkmemory, vkaddress);
    }


    public VkPhysicalDeviceMultiviewFeatures(VkStructureType sType, VkObject pNext, VkBool32 multiview, VkBool32 multiviewGeometryShader, VkBool32 multiviewTessellationShader) {
        super(sizeof());
        setSType(sType);
        setPNext(pNext);
        setMultiview(multiview);
        setMultiviewGeometryShader(multiviewGeometryShader);
        setMultiviewTessellationShader(multiviewTessellationShader);
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

    public VkBool32 getMultiview() {
        return new VkBool32(getVkMemory(), getMultiview(getVkAddress()));
    }

    public void setMultiview(VkBool32 multiview) {
        setMultiview(getVkAddress(), multiview.getVkAddress());
    }

    private static native long getMultiview(long address);
    private static native void setMultiview(long address, long multiview);

    public VkBool32 getMultiviewGeometryShader() {
        return new VkBool32(getVkMemory(), getMultiviewGeometryShader(getVkAddress()));
    }

    public void setMultiviewGeometryShader(VkBool32 multiviewGeometryShader) {
        setMultiviewGeometryShader(getVkAddress(), multiviewGeometryShader.getVkAddress());
    }

    private static native long getMultiviewGeometryShader(long address);
    private static native void setMultiviewGeometryShader(long address, long multiviewGeometryShader);

    public VkBool32 getMultiviewTessellationShader() {
        return new VkBool32(getVkMemory(), getMultiviewTessellationShader(getVkAddress()));
    }

    public void setMultiviewTessellationShader(VkBool32 multiviewTessellationShader) {
        setMultiviewTessellationShader(getVkAddress(), multiviewTessellationShader.getVkAddress());
    }

    private static native long getMultiviewTessellationShader(long address);
    private static native void setMultiviewTessellationShader(long address, long multiviewTessellationShader);


    public static native long sizeof();

    public static class Array extends VkPhysicalDeviceMultiviewFeatures implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceMultiviewFeatures> {
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
        public VkPhysicalDeviceMultiviewFeatures get(int i){
            return new VkPhysicalDeviceMultiviewFeatures(getVkMemory(), getVkAddress() + sizeof()*i);
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

            public Array(VkPhysicalDeviceMultiviewFeatures[] a) {
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
