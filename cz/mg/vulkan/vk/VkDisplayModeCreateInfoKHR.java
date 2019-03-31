package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDisplayModeCreateInfoKHR.html">khronos documentation</a>
 **/
public class VkDisplayModeCreateInfoKHR extends VkObject {
    public VkDisplayModeCreateInfoKHR() {
        super(sizeof());
    }

    public VkDisplayModeCreateInfoKHR(VkMemory vkmemory) {
        super(sizeof(), vkmemory);
    }

    public VkDisplayModeCreateInfoKHR(VkMemory vkmemory, long vkaddress) {
        super(sizeof(), vkmemory, vkaddress);
    }


    public VkDisplayModeCreateInfoKHR(VkObject pNext, VkDisplayModeCreateFlagsKHR flags, VkDisplayModeParametersKHR parameters) {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DISPLAY_MODE_CREATE_INFO_KHR));
        setPNext(pNext);
        setFlags(flags);
        setParameters(parameters);
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

    public VkDisplayModeCreateFlagsKHR getFlags() {
        return new VkDisplayModeCreateFlagsKHR(getVkMemory(), getFlags(getVkAddress()));
    }

    public void setFlags(VkDisplayModeCreateFlagsKHR flags) {
        setFlags(getVkAddress(), flags.getVkAddress());
    }

    private static native long getFlags(long address);
    private static native void setFlags(long address, long flags);

    public VkDisplayModeParametersKHR getParameters() {
        return new VkDisplayModeParametersKHR(getVkMemory(), getParameters(getVkAddress()));
    }

    public void setParameters(VkDisplayModeParametersKHR parameters) {
        setParameters(getVkAddress(), parameters.getVkAddress());
    }

    private static native long getParameters(long address);
    private static native void setParameters(long address, long parameters);


    public static native long sizeof();

    public static class Array extends VkDisplayModeCreateInfoKHR implements cz.mg.collections.array.ReadonlyArray<VkDisplayModeCreateInfoKHR> {
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
        public VkDisplayModeCreateInfoKHR get(int i){
            return new VkDisplayModeCreateInfoKHR(getVkMemory(), getVkAddress() + sizeof()*i);
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

            public Array(VkDisplayModeCreateInfoKHR[] a) {
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
