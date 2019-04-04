package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSemaphoreImportFlags.html">khronos documentation</a>
 **/
public class VulkanSemaphoreImportFlags extends VulkanFlags {
    public VulkanSemaphoreImportFlags(){
        super(new VkSemaphoreImportFlags());
    }

    public VulkanSemaphoreImportFlags(VkSemaphoreImportFlags vk){
        super(vk);
    }

    @Override
    public VkSemaphoreImportFlags getVk(){
        return (VkSemaphoreImportFlags) super.getVk();
    }

    public VulkanSemaphoreImportFlags(int value){
        super(new VkSemaphoreImportFlags(value));
    }

    public static class Array extends VulkanSemaphoreImportFlags implements cz.mg.collections.array.ReadonlyArray<VulkanSemaphoreImportFlags> {
        public Array(VkSemaphoreImportFlags.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkSemaphoreImportFlags.Array(count));
        }

        public Array(int count, VulkanSemaphoreImportFlags o){
            this(new VkSemaphoreImportFlags.Array(count, o.getVk()));
        }

        @Override
        public VkSemaphoreImportFlags.Array getVk(){
            return (VkSemaphoreImportFlags.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanSemaphoreImportFlags get(int i){
            return new VulkanSemaphoreImportFlags(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkSemaphoreImportFlags.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkSemaphoreImportFlags.Pointer());
        }

        public Pointer(long value) {
            this(new VkSemaphoreImportFlags.Pointer(value));
        }

        @Override
        public VkSemaphoreImportFlags.Pointer getVk(){
            return (VkSemaphoreImportFlags.Pointer) super.getVk();
        }

        public static class Array extends VulkanSemaphoreImportFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanSemaphoreImportFlags.Pointer> {
            public Array(int count) {
                super(new VkSemaphoreImportFlags.Pointer.Array(count));
            }

            public Array(VulkanSemaphoreImportFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkSemaphoreImportFlags.Pointer.Array getVk(){
                return (VkSemaphoreImportFlags.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanSemaphoreImportFlags.Pointer get(int i){
                return new VulkanSemaphoreImportFlags.Pointer(getVk().get(i));
            }
        }
    }
}
