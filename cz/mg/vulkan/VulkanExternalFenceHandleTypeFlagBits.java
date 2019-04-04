package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkExternalFenceHandleTypeFlagBits.html">khronos documentation</a>
 **/
public class VulkanExternalFenceHandleTypeFlagBits extends VulkanFlagBits {
    public static final int OPAQUE_FD = VkExternalFenceHandleTypeFlagBits.VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_FD_BIT;
    public static final int OPAQUE_WIN32 = VkExternalFenceHandleTypeFlagBits.VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_BIT;
    public static final int OPAQUE_WIN32_KMT = VkExternalFenceHandleTypeFlagBits.VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT;
    public static final int SYNC_FD = VkExternalFenceHandleTypeFlagBits.VK_EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT;
    public static final int OPAQUE_FD_KHR = VkExternalFenceHandleTypeFlagBits.VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_FD_BIT_KHR;
    public static final int OPAQUE_WIN32_KHR = VkExternalFenceHandleTypeFlagBits.VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHR;
    public static final int OPAQUE_WIN32_KMT_KHR = VkExternalFenceHandleTypeFlagBits.VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHR;
    public static final int SYNC_FD_KHR = VkExternalFenceHandleTypeFlagBits.VK_EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT_KHR;

    public VulkanExternalFenceHandleTypeFlagBits(){
        super(new VkExternalFenceHandleTypeFlagBits());
    }

    public VulkanExternalFenceHandleTypeFlagBits(VkExternalFenceHandleTypeFlagBits vk){
        super(vk);
    }

    @Override
    public VkExternalFenceHandleTypeFlagBits getVk(){
        return (VkExternalFenceHandleTypeFlagBits) super.getVk();
    }

    public VulkanExternalFenceHandleTypeFlagBits(int value){
        super(new VkExternalFenceHandleTypeFlagBits(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == OPAQUE_FD) s += "OPAQUE_FD";
        if(getValue() == OPAQUE_WIN32) s += "OPAQUE_WIN32";
        if(getValue() == OPAQUE_WIN32_KMT) s += "OPAQUE_WIN32_KMT";
        if(getValue() == SYNC_FD) s += "SYNC_FD";
        if(getValue() == OPAQUE_FD_KHR) s += "OPAQUE_FD_KHR";
        if(getValue() == OPAQUE_WIN32_KHR) s += "OPAQUE_WIN32_KHR";
        if(getValue() == OPAQUE_WIN32_KMT_KHR) s += "OPAQUE_WIN32_KMT_KHR";
        if(getValue() == SYNC_FD_KHR) s += "SYNC_FD_KHR";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VulkanExternalFenceHandleTypeFlagBits implements cz.mg.collections.array.ReadonlyArray<VulkanExternalFenceHandleTypeFlagBits> {
        public Array(VkExternalFenceHandleTypeFlagBits.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkExternalFenceHandleTypeFlagBits.Array(count));
        }

        public Array(int count, VulkanExternalFenceHandleTypeFlagBits o){
            this(new VkExternalFenceHandleTypeFlagBits.Array(count, o.getVk()));
        }

        @Override
        public VkExternalFenceHandleTypeFlagBits.Array getVk(){
            return (VkExternalFenceHandleTypeFlagBits.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanExternalFenceHandleTypeFlagBits get(int i){
            return new VulkanExternalFenceHandleTypeFlagBits(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkExternalFenceHandleTypeFlagBits.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkExternalFenceHandleTypeFlagBits.Pointer());
        }

        public Pointer(long value) {
            this(new VkExternalFenceHandleTypeFlagBits.Pointer(value));
        }

        @Override
        public VkExternalFenceHandleTypeFlagBits.Pointer getVk(){
            return (VkExternalFenceHandleTypeFlagBits.Pointer) super.getVk();
        }

        public static class Array extends VulkanExternalFenceHandleTypeFlagBits.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanExternalFenceHandleTypeFlagBits.Pointer> {
            public Array(int count) {
                super(new VkExternalFenceHandleTypeFlagBits.Pointer.Array(count));
            }

            public Array(VulkanExternalFenceHandleTypeFlagBits[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkExternalFenceHandleTypeFlagBits.Pointer.Array getVk(){
                return (VkExternalFenceHandleTypeFlagBits.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanExternalFenceHandleTypeFlagBits.Pointer get(int i){
                return new VulkanExternalFenceHandleTypeFlagBits.Pointer(getVk().get(i));
            }
        }
    }
}
