package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkExternalSemaphoreHandleTypeFlagBits.html">khronos documentation</a>
 **/
public class VulkanExternalSemaphoreHandleTypeFlagBits extends VulkanFlagBits {
    public static final int OPAQUE_FD = VkExternalSemaphoreHandleTypeFlagBits.VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD_BIT;
    public static final int OPAQUE_WIN32 = VkExternalSemaphoreHandleTypeFlagBits.VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_BIT;
    public static final int OPAQUE_WIN32_KMT = VkExternalSemaphoreHandleTypeFlagBits.VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT;
    public static final int D3D12_FENCE = VkExternalSemaphoreHandleTypeFlagBits.VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE_BIT;
    public static final int SYNC_FD = VkExternalSemaphoreHandleTypeFlagBits.VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_SYNC_FD_BIT;
    public static final int OPAQUE_FD_KHR = VkExternalSemaphoreHandleTypeFlagBits.VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD_BIT_KHR;
    public static final int OPAQUE_WIN32_KHR = VkExternalSemaphoreHandleTypeFlagBits.VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHR;
    public static final int OPAQUE_WIN32_KMT_KHR = VkExternalSemaphoreHandleTypeFlagBits.VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHR;
    public static final int D3D12_FENCE_KHR = VkExternalSemaphoreHandleTypeFlagBits.VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE_BIT_KHR;
    public static final int SYNC_FD_KHR = VkExternalSemaphoreHandleTypeFlagBits.VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_SYNC_FD_BIT_KHR;

    public VulkanExternalSemaphoreHandleTypeFlagBits(){
        super(new VkExternalSemaphoreHandleTypeFlagBits());
    }

    public VulkanExternalSemaphoreHandleTypeFlagBits(VkExternalSemaphoreHandleTypeFlagBits vk){
        super(vk);
    }

    @Override
    public VkExternalSemaphoreHandleTypeFlagBits getVk(){
        return (VkExternalSemaphoreHandleTypeFlagBits) super.getVk();
    }

    public VulkanExternalSemaphoreHandleTypeFlagBits(int value){
        super(new VkExternalSemaphoreHandleTypeFlagBits(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == OPAQUE_FD) s += "OPAQUE_FD";
        if(getValue() == OPAQUE_WIN32) s += "OPAQUE_WIN32";
        if(getValue() == OPAQUE_WIN32_KMT) s += "OPAQUE_WIN32_KMT";
        if(getValue() == D3D12_FENCE) s += "D3D12_FENCE";
        if(getValue() == SYNC_FD) s += "SYNC_FD";
        if(getValue() == OPAQUE_FD_KHR) s += "OPAQUE_FD_KHR";
        if(getValue() == OPAQUE_WIN32_KHR) s += "OPAQUE_WIN32_KHR";
        if(getValue() == OPAQUE_WIN32_KMT_KHR) s += "OPAQUE_WIN32_KMT_KHR";
        if(getValue() == D3D12_FENCE_KHR) s += "D3D12_FENCE_KHR";
        if(getValue() == SYNC_FD_KHR) s += "SYNC_FD_KHR";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VulkanExternalSemaphoreHandleTypeFlagBits implements cz.mg.collections.array.ReadonlyArray<VulkanExternalSemaphoreHandleTypeFlagBits> {
        public Array(VkExternalSemaphoreHandleTypeFlagBits.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkExternalSemaphoreHandleTypeFlagBits.Array(count));
        }

        public Array(int count, VulkanExternalSemaphoreHandleTypeFlagBits o){
            this(new VkExternalSemaphoreHandleTypeFlagBits.Array(count, o.getVk()));
        }

        @Override
        public VkExternalSemaphoreHandleTypeFlagBits.Array getVk(){
            return (VkExternalSemaphoreHandleTypeFlagBits.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanExternalSemaphoreHandleTypeFlagBits get(int i){
            return new VulkanExternalSemaphoreHandleTypeFlagBits(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkExternalSemaphoreHandleTypeFlagBits.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkExternalSemaphoreHandleTypeFlagBits.Pointer());
        }

        public Pointer(long value) {
            this(new VkExternalSemaphoreHandleTypeFlagBits.Pointer(value));
        }

        @Override
        public VkExternalSemaphoreHandleTypeFlagBits.Pointer getVk(){
            return (VkExternalSemaphoreHandleTypeFlagBits.Pointer) super.getVk();
        }

        public static class Array extends VulkanExternalSemaphoreHandleTypeFlagBits.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanExternalSemaphoreHandleTypeFlagBits.Pointer> {
            public Array(int count) {
                super(new VkExternalSemaphoreHandleTypeFlagBits.Pointer.Array(count));
            }

            public Array(VulkanExternalSemaphoreHandleTypeFlagBits[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkExternalSemaphoreHandleTypeFlagBits.Pointer.Array getVk(){
                return (VkExternalSemaphoreHandleTypeFlagBits.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanExternalSemaphoreHandleTypeFlagBits.Pointer get(int i){
                return new VulkanExternalSemaphoreHandleTypeFlagBits.Pointer(getVk().get(i));
            }
        }
    }
}
