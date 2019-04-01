package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkExternalFenceHandleTypeFlagBits.html">khronos documentation</a>
 **/
public class VkExternalFenceHandleTypeFlagBits extends VkFlagBits {
    public static final int VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_FD_BIT = 0x00000001;
    public static final int VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_BIT = 0x00000002;
    public static final int VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT = 0x00000004;
    public static final int VK_EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT = 0x00000008;
    public static final int VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_FD_BIT_KHR = VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_FD_BIT;
    public static final int VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHR = VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_BIT;
    public static final int VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHR = VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT;
    public static final int VK_EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT_KHR = VK_EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT;

    public VkExternalFenceHandleTypeFlagBits() {
    }

    public VkExternalFenceHandleTypeFlagBits(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkExternalFenceHandleTypeFlagBits(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkExternalFenceHandleTypeFlagBits(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_FD_BIT) s += "VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_FD_BIT ";
        if(getValue() == VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_BIT) s += "VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_BIT ";
        if(getValue() == VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT) s += "VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT ";
        if(getValue() == VK_EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT) s += "VK_EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT ";
        if(getValue() == VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_FD_BIT_KHR) s += "VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_FD_BIT_KHR ";
        if(getValue() == VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHR) s += "VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHR ";
        if(getValue() == VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHR) s += "VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHR ";
        if(getValue() == VK_EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT_KHR) s += "VK_EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT_KHR ";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VkExternalFenceHandleTypeFlagBits implements cz.mg.collections.array.ReadonlyArray<VkExternalFenceHandleTypeFlagBits> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkExternalFenceHandleTypeFlagBits.sizeof()));
            this.count = count;
        }

        public Array(int count, VkExternalFenceHandleTypeFlagBits o){
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
        public VkExternalFenceHandleTypeFlagBits get(int i){
            return new VkExternalFenceHandleTypeFlagBits(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkExternalFenceHandleTypeFlagBits.Pointer implements cz.mg.collections.array.ReadonlyArray<Pointer> {
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

            public Array(VkExternalFenceHandleTypeFlagBits[] a) {
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
