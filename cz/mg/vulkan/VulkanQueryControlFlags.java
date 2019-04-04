package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkQueryControlFlags.html">khronos documentation</a>
 **/
public class VulkanQueryControlFlags extends VulkanFlags {
    public VulkanQueryControlFlags(){
        super(new VkQueryControlFlags());
    }

    public VulkanQueryControlFlags(VkQueryControlFlags vk){
        super(vk);
    }

    @Override
    public VkQueryControlFlags getVk(){
        return (VkQueryControlFlags) super.getVk();
    }

    public VulkanQueryControlFlags(int value){
        super(new VkQueryControlFlags(value));
    }

    public static class Array extends VulkanQueryControlFlags implements cz.mg.collections.array.ReadonlyArray<VulkanQueryControlFlags> {
        public Array(VkQueryControlFlags.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkQueryControlFlags.Array(count));
        }

        public Array(int count, VulkanQueryControlFlags o){
            this(new VkQueryControlFlags.Array(count, o.getVk()));
        }

        @Override
        public VkQueryControlFlags.Array getVk(){
            return (VkQueryControlFlags.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanQueryControlFlags get(int i){
            return new VulkanQueryControlFlags(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkQueryControlFlags.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkQueryControlFlags.Pointer());
        }

        public Pointer(long value) {
            this(new VkQueryControlFlags.Pointer(value));
        }

        @Override
        public VkQueryControlFlags.Pointer getVk(){
            return (VkQueryControlFlags.Pointer) super.getVk();
        }

        public static class Array extends VulkanQueryControlFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanQueryControlFlags.Pointer> {
            public Array(int count) {
                super(new VkQueryControlFlags.Pointer.Array(count));
            }

            public Array(VulkanQueryControlFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkQueryControlFlags.Pointer.Array getVk(){
                return (VkQueryControlFlags.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanQueryControlFlags.Pointer get(int i){
                return new VulkanQueryControlFlags.Pointer(getVk().get(i));
            }
        }
    }
}
