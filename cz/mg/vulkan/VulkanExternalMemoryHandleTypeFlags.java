package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkExternalMemoryHandleTypeFlags.html">khronos documentation</a>
 **/
public class VulkanExternalMemoryHandleTypeFlags extends VulkanFlags {
    public VulkanExternalMemoryHandleTypeFlags(){
        super(new VkExternalMemoryHandleTypeFlags());
    }

    public VulkanExternalMemoryHandleTypeFlags(VkExternalMemoryHandleTypeFlags vk){
        super(vk);
    }

    @Override
    public VkExternalMemoryHandleTypeFlags getVk(){
        return (VkExternalMemoryHandleTypeFlags) super.getVk();
    }

    public VulkanExternalMemoryHandleTypeFlags(int value){
        super(new VkExternalMemoryHandleTypeFlags(value));
    }

    public static class Array extends VulkanExternalMemoryHandleTypeFlags implements cz.mg.collections.array.ReadonlyArray<VulkanExternalMemoryHandleTypeFlags> {
        public Array(VkExternalMemoryHandleTypeFlags.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkExternalMemoryHandleTypeFlags.Array(count));
        }

        public Array(int count, VulkanExternalMemoryHandleTypeFlags o){
            this(new VkExternalMemoryHandleTypeFlags.Array(count, o.getVk()));
        }

        @Override
        public VkExternalMemoryHandleTypeFlags.Array getVk(){
            return (VkExternalMemoryHandleTypeFlags.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanExternalMemoryHandleTypeFlags get(int i){
            return new VulkanExternalMemoryHandleTypeFlags(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkExternalMemoryHandleTypeFlags.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkExternalMemoryHandleTypeFlags.Pointer());
        }

        public Pointer(long value) {
            this(new VkExternalMemoryHandleTypeFlags.Pointer(value));
        }

        @Override
        public VkExternalMemoryHandleTypeFlags.Pointer getVk(){
            return (VkExternalMemoryHandleTypeFlags.Pointer) super.getVk();
        }

        public static class Array extends VulkanExternalMemoryHandleTypeFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanExternalMemoryHandleTypeFlags.Pointer> {
            public Array(int count) {
                super(new VkExternalMemoryHandleTypeFlags.Pointer.Array(count));
            }

            public Array(VulkanExternalMemoryHandleTypeFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkExternalMemoryHandleTypeFlags.Pointer.Array getVk(){
                return (VkExternalMemoryHandleTypeFlags.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanExternalMemoryHandleTypeFlags.Pointer get(int i){
                return new VulkanExternalMemoryHandleTypeFlags.Pointer(getVk().get(i));
            }
        }
    }
}
