package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkCullModeFlags.html">khronos documentation</a>
 **/
public class VulkanCullModeFlags extends VulkanFlags {
    public VulkanCullModeFlags(){
        super(new VkCullModeFlags());
    }

    public VulkanCullModeFlags(VkCullModeFlags vk){
        super(vk);
    }

    @Override
    public VkCullModeFlags getVk(){
        return (VkCullModeFlags) super.getVk();
    }

    public VulkanCullModeFlags(int value){
        super(new VkCullModeFlags(value));
    }

    public static class Array extends VulkanCullModeFlags implements cz.mg.collections.array.ReadonlyArray<VulkanCullModeFlags> {
        public Array(VkCullModeFlags.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkCullModeFlags.Array(count));
        }

        public Array(int count, VulkanCullModeFlags o){
            this(new VkCullModeFlags.Array(count, o.getVk()));
        }

        @Override
        public VkCullModeFlags.Array getVk(){
            return (VkCullModeFlags.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanCullModeFlags get(int i){
            return new VulkanCullModeFlags(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkCullModeFlags.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkCullModeFlags.Pointer());
        }

        public Pointer(long value) {
            this(new VkCullModeFlags.Pointer(value));
        }

        @Override
        public VkCullModeFlags.Pointer getVk(){
            return (VkCullModeFlags.Pointer) super.getVk();
        }

        public static class Array extends VulkanCullModeFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanCullModeFlags.Pointer> {
            public Array(int count) {
                super(new VkCullModeFlags.Pointer.Array(count));
            }

            public Array(VulkanCullModeFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkCullModeFlags.Pointer.Array getVk(){
                return (VkCullModeFlags.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanCullModeFlags.Pointer get(int i){
                return new VulkanCullModeFlags.Pointer(getVk().get(i));
            }
        }
    }
}
