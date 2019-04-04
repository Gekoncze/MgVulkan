package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkExternalMemoryHandleTypeFlagsNV.html">khronos documentation</a>
 **/
public class VulkanExternalMemoryHandleTypeFlagsNV extends VulkanFlags {
    public VulkanExternalMemoryHandleTypeFlagsNV(){
        super(new VkExternalMemoryHandleTypeFlagsNV());
    }

    public VulkanExternalMemoryHandleTypeFlagsNV(VkExternalMemoryHandleTypeFlagsNV vk){
        super(vk);
    }

    @Override
    public VkExternalMemoryHandleTypeFlagsNV getVk(){
        return (VkExternalMemoryHandleTypeFlagsNV) super.getVk();
    }

    public VulkanExternalMemoryHandleTypeFlagsNV(int value){
        super(new VkExternalMemoryHandleTypeFlagsNV(value));
    }

    public static class Array extends VulkanExternalMemoryHandleTypeFlagsNV implements cz.mg.collections.array.ReadonlyArray<VulkanExternalMemoryHandleTypeFlagsNV> {
        public Array(VkExternalMemoryHandleTypeFlagsNV.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkExternalMemoryHandleTypeFlagsNV.Array(count));
        }

        public Array(int count, VulkanExternalMemoryHandleTypeFlagsNV o){
            this(new VkExternalMemoryHandleTypeFlagsNV.Array(count, o.getVk()));
        }

        @Override
        public VkExternalMemoryHandleTypeFlagsNV.Array getVk(){
            return (VkExternalMemoryHandleTypeFlagsNV.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanExternalMemoryHandleTypeFlagsNV get(int i){
            return new VulkanExternalMemoryHandleTypeFlagsNV(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkExternalMemoryHandleTypeFlagsNV.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkExternalMemoryHandleTypeFlagsNV.Pointer());
        }

        public Pointer(long value) {
            this(new VkExternalMemoryHandleTypeFlagsNV.Pointer(value));
        }

        @Override
        public VkExternalMemoryHandleTypeFlagsNV.Pointer getVk(){
            return (VkExternalMemoryHandleTypeFlagsNV.Pointer) super.getVk();
        }

        public static class Array extends VulkanExternalMemoryHandleTypeFlagsNV.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanExternalMemoryHandleTypeFlagsNV.Pointer> {
            public Array(int count) {
                super(new VkExternalMemoryHandleTypeFlagsNV.Pointer.Array(count));
            }

            public Array(VulkanExternalMemoryHandleTypeFlagsNV[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkExternalMemoryHandleTypeFlagsNV.Pointer.Array getVk(){
                return (VkExternalMemoryHandleTypeFlagsNV.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanExternalMemoryHandleTypeFlagsNV.Pointer get(int i){
                return new VulkanExternalMemoryHandleTypeFlagsNV.Pointer(getVk().get(i));
            }
        }
    }
}
