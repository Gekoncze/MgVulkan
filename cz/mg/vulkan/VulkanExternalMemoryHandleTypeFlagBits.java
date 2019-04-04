package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkExternalMemoryHandleTypeFlagBits.html">khronos documentation</a>
 **/
public class VulkanExternalMemoryHandleTypeFlagBits extends VulkanFlagBits {
    public static final int OPAQUE_FD = VkExternalMemoryHandleTypeFlagBits.VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_FD_BIT;
    public static final int OPAQUE_WIN32 = VkExternalMemoryHandleTypeFlagBits.VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT;
    public static final int OPAQUE_WIN32_KMT = VkExternalMemoryHandleTypeFlagBits.VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT;
    public static final int D3D11_TEXTURE = VkExternalMemoryHandleTypeFlagBits.VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT;
    public static final int D3D11_TEXTURE_KMT = VkExternalMemoryHandleTypeFlagBits.VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_KMT_BIT;
    public static final int D3D12_HEAP = VkExternalMemoryHandleTypeFlagBits.VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP_BIT;
    public static final int D3D12_RESOURCE = VkExternalMemoryHandleTypeFlagBits.VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE_BIT;
    public static final int DMA_BUF_EXT = VkExternalMemoryHandleTypeFlagBits.VK_EXTERNAL_MEMORY_HANDLE_TYPE_DMA_BUF_BIT_EXT;
    public static final int ANDROID_HARDWARE_BUFFER_ANDROID = VkExternalMemoryHandleTypeFlagBits.VK_EXTERNAL_MEMORY_HANDLE_TYPE_ANDROID_HARDWARE_BUFFER_BIT_ANDROID;
    public static final int HOST_ALLOCATION_EXT = VkExternalMemoryHandleTypeFlagBits.VK_EXTERNAL_MEMORY_HANDLE_TYPE_HOST_ALLOCATION_BIT_EXT;
    public static final int HOST_MAPPED_FOREIGN_MEMORY_EXT = VkExternalMemoryHandleTypeFlagBits.VK_EXTERNAL_MEMORY_HANDLE_TYPE_HOST_MAPPED_FOREIGN_MEMORY_BIT_EXT;
    public static final int OPAQUE_FD_KHR = VkExternalMemoryHandleTypeFlagBits.VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_FD_BIT_KHR;
    public static final int OPAQUE_WIN32_KHR = VkExternalMemoryHandleTypeFlagBits.VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHR;
    public static final int OPAQUE_WIN32_KMT_KHR = VkExternalMemoryHandleTypeFlagBits.VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHR;
    public static final int D3D11_TEXTURE_KHR = VkExternalMemoryHandleTypeFlagBits.VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT_KHR;
    public static final int D3D11_TEXTURE_KMT_KHR = VkExternalMemoryHandleTypeFlagBits.VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_KMT_BIT_KHR;
    public static final int D3D12_HEAP_KHR = VkExternalMemoryHandleTypeFlagBits.VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP_BIT_KHR;
    public static final int D3D12_RESOURCE_KHR = VkExternalMemoryHandleTypeFlagBits.VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE_BIT_KHR;

    public VulkanExternalMemoryHandleTypeFlagBits(){
        super(new VkExternalMemoryHandleTypeFlagBits());
    }

    public VulkanExternalMemoryHandleTypeFlagBits(VkExternalMemoryHandleTypeFlagBits vk){
        super(vk);
    }

    @Override
    public VkExternalMemoryHandleTypeFlagBits getVk(){
        return (VkExternalMemoryHandleTypeFlagBits) super.getVk();
    }

    public VulkanExternalMemoryHandleTypeFlagBits(int value){
        super(new VkExternalMemoryHandleTypeFlagBits(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == OPAQUE_FD) s += "OPAQUE_FD";
        if(getValue() == OPAQUE_WIN32) s += "OPAQUE_WIN32";
        if(getValue() == OPAQUE_WIN32_KMT) s += "OPAQUE_WIN32_KMT";
        if(getValue() == D3D11_TEXTURE) s += "D3D11_TEXTURE";
        if(getValue() == D3D11_TEXTURE_KMT) s += "D3D11_TEXTURE_KMT";
        if(getValue() == D3D12_HEAP) s += "D3D12_HEAP";
        if(getValue() == D3D12_RESOURCE) s += "D3D12_RESOURCE";
        if(getValue() == DMA_BUF_EXT) s += "DMA_BUF_EXT";
        if(getValue() == ANDROID_HARDWARE_BUFFER_ANDROID) s += "ANDROID_HARDWARE_BUFFER_ANDROID";
        if(getValue() == HOST_ALLOCATION_EXT) s += "HOST_ALLOCATION_EXT";
        if(getValue() == HOST_MAPPED_FOREIGN_MEMORY_EXT) s += "HOST_MAPPED_FOREIGN_MEMORY_EXT";
        if(getValue() == OPAQUE_FD_KHR) s += "OPAQUE_FD_KHR";
        if(getValue() == OPAQUE_WIN32_KHR) s += "OPAQUE_WIN32_KHR";
        if(getValue() == OPAQUE_WIN32_KMT_KHR) s += "OPAQUE_WIN32_KMT_KHR";
        if(getValue() == D3D11_TEXTURE_KHR) s += "D3D11_TEXTURE_KHR";
        if(getValue() == D3D11_TEXTURE_KMT_KHR) s += "D3D11_TEXTURE_KMT_KHR";
        if(getValue() == D3D12_HEAP_KHR) s += "D3D12_HEAP_KHR";
        if(getValue() == D3D12_RESOURCE_KHR) s += "D3D12_RESOURCE_KHR";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VulkanExternalMemoryHandleTypeFlagBits implements cz.mg.collections.array.ReadonlyArray<VulkanExternalMemoryHandleTypeFlagBits> {
        public Array(VkExternalMemoryHandleTypeFlagBits.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkExternalMemoryHandleTypeFlagBits.Array(count));
        }

        public Array(int count, VulkanExternalMemoryHandleTypeFlagBits o){
            this(new VkExternalMemoryHandleTypeFlagBits.Array(count, o.getVk()));
        }

        @Override
        public VkExternalMemoryHandleTypeFlagBits.Array getVk(){
            return (VkExternalMemoryHandleTypeFlagBits.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanExternalMemoryHandleTypeFlagBits get(int i){
            return new VulkanExternalMemoryHandleTypeFlagBits(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkExternalMemoryHandleTypeFlagBits.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkExternalMemoryHandleTypeFlagBits.Pointer());
        }

        public Pointer(long value) {
            this(new VkExternalMemoryHandleTypeFlagBits.Pointer(value));
        }

        @Override
        public VkExternalMemoryHandleTypeFlagBits.Pointer getVk(){
            return (VkExternalMemoryHandleTypeFlagBits.Pointer) super.getVk();
        }

        public static class Array extends VulkanExternalMemoryHandleTypeFlagBits.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanExternalMemoryHandleTypeFlagBits.Pointer> {
            public Array(int count) {
                super(new VkExternalMemoryHandleTypeFlagBits.Pointer.Array(count));
            }

            public Array(VulkanExternalMemoryHandleTypeFlagBits[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkExternalMemoryHandleTypeFlagBits.Pointer.Array getVk(){
                return (VkExternalMemoryHandleTypeFlagBits.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanExternalMemoryHandleTypeFlagBits.Pointer get(int i){
                return new VulkanExternalMemoryHandleTypeFlagBits.Pointer(getVk().get(i));
            }
        }
    }
}
