package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkAccessFlags.html">khronos documentation</a>
 **/
public class VulkanAccessFlags extends VulkanFlags {
    public VulkanAccessFlags(){
        super(new VkAccessFlags());
    }

    public VulkanAccessFlags(VkAccessFlags vk){
        super(vk);
    }

    @Override
    public VkAccessFlags getVk(){
        return (VkAccessFlags) super.getVk();
    }

    public VulkanAccessFlags(int value){
        super(new VkAccessFlags(value));
    }

    public static class Array extends VulkanAccessFlags implements cz.mg.collections.array.ReadonlyArray<VulkanAccessFlags> {
        public Array(VkAccessFlags.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkAccessFlags.Array(count));
        }

        public Array(int count, VulkanAccessFlags o){
            this(new VkAccessFlags.Array(count, o.getVk()));
        }

        @Override
        public VkAccessFlags.Array getVk(){
            return (VkAccessFlags.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanAccessFlags get(int i){
            return new VulkanAccessFlags(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkAccessFlags.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkAccessFlags.Pointer());
        }

        public Pointer(long value) {
            this(new VkAccessFlags.Pointer(value));
        }

        @Override
        public VkAccessFlags.Pointer getVk(){
            return (VkAccessFlags.Pointer) super.getVk();
        }

        public static class Array extends VulkanAccessFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanAccessFlags.Pointer> {
            public Array(int count) {
                super(new VkAccessFlags.Pointer.Array(count));
            }

            public Array(VulkanAccessFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkAccessFlags.Pointer.Array getVk(){
                return (VkAccessFlags.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanAccessFlags.Pointer get(int i){
                return new VulkanAccessFlags.Pointer(getVk().get(i));
            }
        }
    }
}
