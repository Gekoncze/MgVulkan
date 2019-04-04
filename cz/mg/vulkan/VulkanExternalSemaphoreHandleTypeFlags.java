package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkExternalSemaphoreHandleTypeFlags.html">khronos documentation</a>
 **/
public class VulkanExternalSemaphoreHandleTypeFlags extends VulkanFlags {
    public VulkanExternalSemaphoreHandleTypeFlags(){
        super(new VkExternalSemaphoreHandleTypeFlags());
    }

    public VulkanExternalSemaphoreHandleTypeFlags(VkExternalSemaphoreHandleTypeFlags vk){
        super(vk);
    }

    @Override
    public VkExternalSemaphoreHandleTypeFlags getVk(){
        return (VkExternalSemaphoreHandleTypeFlags) super.getVk();
    }

    public VulkanExternalSemaphoreHandleTypeFlags(int value){
        super(new VkExternalSemaphoreHandleTypeFlags(value));
    }

    public static class Array extends VulkanExternalSemaphoreHandleTypeFlags implements cz.mg.collections.array.ReadonlyArray<VulkanExternalSemaphoreHandleTypeFlags> {
        public Array(VkExternalSemaphoreHandleTypeFlags.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkExternalSemaphoreHandleTypeFlags.Array(count));
        }

        public Array(int count, VulkanExternalSemaphoreHandleTypeFlags o){
            this(new VkExternalSemaphoreHandleTypeFlags.Array(count, o.getVk()));
        }

        @Override
        public VkExternalSemaphoreHandleTypeFlags.Array getVk(){
            return (VkExternalSemaphoreHandleTypeFlags.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanExternalSemaphoreHandleTypeFlags get(int i){
            return new VulkanExternalSemaphoreHandleTypeFlags(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkExternalSemaphoreHandleTypeFlags.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkExternalSemaphoreHandleTypeFlags.Pointer());
        }

        public Pointer(long value) {
            this(new VkExternalSemaphoreHandleTypeFlags.Pointer(value));
        }

        @Override
        public VkExternalSemaphoreHandleTypeFlags.Pointer getVk(){
            return (VkExternalSemaphoreHandleTypeFlags.Pointer) super.getVk();
        }

        public static class Array extends VulkanExternalSemaphoreHandleTypeFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanExternalSemaphoreHandleTypeFlags.Pointer> {
            public Array(int count) {
                super(new VkExternalSemaphoreHandleTypeFlags.Pointer.Array(count));
            }

            public Array(VulkanExternalSemaphoreHandleTypeFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkExternalSemaphoreHandleTypeFlags.Pointer.Array getVk(){
                return (VkExternalSemaphoreHandleTypeFlags.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanExternalSemaphoreHandleTypeFlags.Pointer get(int i){
                return new VulkanExternalSemaphoreHandleTypeFlags.Pointer(getVk().get(i));
            }
        }
    }
}
