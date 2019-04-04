package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSubpassDescriptionFlags.html">khronos documentation</a>
 **/
public class VulkanSubpassDescriptionFlags extends VulkanFlags {
    public VulkanSubpassDescriptionFlags(){
        super(new VkSubpassDescriptionFlags());
    }

    public VulkanSubpassDescriptionFlags(VkSubpassDescriptionFlags vk){
        super(vk);
    }

    @Override
    public VkSubpassDescriptionFlags getVk(){
        return (VkSubpassDescriptionFlags) super.getVk();
    }

    public VulkanSubpassDescriptionFlags(int value){
        super(new VkSubpassDescriptionFlags(value));
    }

    public static class Array extends VulkanSubpassDescriptionFlags implements cz.mg.collections.array.ReadonlyArray<VulkanSubpassDescriptionFlags> {
        public Array(VkSubpassDescriptionFlags.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkSubpassDescriptionFlags.Array(count));
        }

        public Array(int count, VulkanSubpassDescriptionFlags o){
            this(new VkSubpassDescriptionFlags.Array(count, o.getVk()));
        }

        @Override
        public VkSubpassDescriptionFlags.Array getVk(){
            return (VkSubpassDescriptionFlags.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanSubpassDescriptionFlags get(int i){
            return new VulkanSubpassDescriptionFlags(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkSubpassDescriptionFlags.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkSubpassDescriptionFlags.Pointer());
        }

        public Pointer(long value) {
            this(new VkSubpassDescriptionFlags.Pointer(value));
        }

        @Override
        public VkSubpassDescriptionFlags.Pointer getVk(){
            return (VkSubpassDescriptionFlags.Pointer) super.getVk();
        }

        public static class Array extends VulkanSubpassDescriptionFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanSubpassDescriptionFlags.Pointer> {
            public Array(int count) {
                super(new VkSubpassDescriptionFlags.Pointer.Array(count));
            }

            public Array(VulkanSubpassDescriptionFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkSubpassDescriptionFlags.Pointer.Array getVk(){
                return (VkSubpassDescriptionFlags.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanSubpassDescriptionFlags.Pointer get(int i){
                return new VulkanSubpassDescriptionFlags.Pointer(getVk().get(i));
            }
        }
    }
}
