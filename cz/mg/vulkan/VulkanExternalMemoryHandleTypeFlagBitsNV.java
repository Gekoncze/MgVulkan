package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkExternalMemoryHandleTypeFlagBitsNV.html">khronos documentation</a>
 **/
public class VulkanExternalMemoryHandleTypeFlagBitsNV extends VulkanFlagBits {
    public static final int EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_NV = VkExternalMemoryHandleTypeFlagBitsNV.VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT_NV;
    public static final int EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT_NV = VkExternalMemoryHandleTypeFlagBitsNV.VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_NV;
    public static final int EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_IMAGE_NV = VkExternalMemoryHandleTypeFlagBitsNV.VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_IMAGE_BIT_NV;
    public static final int EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_IMAGE_KMT_NV = VkExternalMemoryHandleTypeFlagBitsNV.VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_IMAGE_KMT_BIT_NV;

    public VulkanExternalMemoryHandleTypeFlagBitsNV(){
        super(new VkExternalMemoryHandleTypeFlagBitsNV());
    }

    public VulkanExternalMemoryHandleTypeFlagBitsNV(VkExternalMemoryHandleTypeFlagBitsNV vk){
        super(vk);
    }

    @Override
    public VkExternalMemoryHandleTypeFlagBitsNV getVk(){
        return (VkExternalMemoryHandleTypeFlagBitsNV) super.getVk();
    }

    public VulkanExternalMemoryHandleTypeFlagBitsNV(int value){
        super(new VkExternalMemoryHandleTypeFlagBitsNV(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_NV) s += "EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_NV";
        if(getValue() == EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT_NV) s += "EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT_NV";
        if(getValue() == EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_IMAGE_NV) s += "EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_IMAGE_NV";
        if(getValue() == EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_IMAGE_KMT_NV) s += "EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_IMAGE_KMT_NV";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VulkanExternalMemoryHandleTypeFlagBitsNV implements cz.mg.collections.array.ReadonlyArray<VulkanExternalMemoryHandleTypeFlagBitsNV> {
        public Array(VkExternalMemoryHandleTypeFlagBitsNV.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkExternalMemoryHandleTypeFlagBitsNV.Array(count));
        }

        public Array(int count, VulkanExternalMemoryHandleTypeFlagBitsNV o){
            this(new VkExternalMemoryHandleTypeFlagBitsNV.Array(count, o.getVk()));
        }

        @Override
        public VkExternalMemoryHandleTypeFlagBitsNV.Array getVk(){
            return (VkExternalMemoryHandleTypeFlagBitsNV.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanExternalMemoryHandleTypeFlagBitsNV get(int i){
            return new VulkanExternalMemoryHandleTypeFlagBitsNV(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkExternalMemoryHandleTypeFlagBitsNV.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkExternalMemoryHandleTypeFlagBitsNV.Pointer());
        }

        public Pointer(long value) {
            this(new VkExternalMemoryHandleTypeFlagBitsNV.Pointer(value));
        }

        @Override
        public VkExternalMemoryHandleTypeFlagBitsNV.Pointer getVk(){
            return (VkExternalMemoryHandleTypeFlagBitsNV.Pointer) super.getVk();
        }

        public static class Array extends VulkanExternalMemoryHandleTypeFlagBitsNV.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanExternalMemoryHandleTypeFlagBitsNV.Pointer> {
            public Array(int count) {
                super(new VkExternalMemoryHandleTypeFlagBitsNV.Pointer.Array(count));
            }

            public Array(VulkanExternalMemoryHandleTypeFlagBitsNV[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkExternalMemoryHandleTypeFlagBitsNV.Pointer.Array getVk(){
                return (VkExternalMemoryHandleTypeFlagBitsNV.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanExternalMemoryHandleTypeFlagBitsNV.Pointer get(int i){
                return new VulkanExternalMemoryHandleTypeFlagBitsNV.Pointer(getVk().get(i));
            }
        }
    }
}
