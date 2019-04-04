package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineDynamicStateCreateFlags.html">khronos documentation</a>
 **/
public class VulkanPipelineDynamicStateCreateFlags extends VulkanFlags {
    public VulkanPipelineDynamicStateCreateFlags(){
        super(new VkPipelineDynamicStateCreateFlags());
    }

    public VulkanPipelineDynamicStateCreateFlags(VkPipelineDynamicStateCreateFlags vk){
        super(vk);
    }

    @Override
    public VkPipelineDynamicStateCreateFlags getVk(){
        return (VkPipelineDynamicStateCreateFlags) super.getVk();
    }

    public VulkanPipelineDynamicStateCreateFlags(int value){
        super(new VkPipelineDynamicStateCreateFlags(value));
    }

    public static class Array extends VulkanPipelineDynamicStateCreateFlags implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineDynamicStateCreateFlags> {
        public Array(VkPipelineDynamicStateCreateFlags.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPipelineDynamicStateCreateFlags.Array(count));
        }

        public Array(int count, VulkanPipelineDynamicStateCreateFlags o){
            this(new VkPipelineDynamicStateCreateFlags.Array(count, o.getVk()));
        }

        @Override
        public VkPipelineDynamicStateCreateFlags.Array getVk(){
            return (VkPipelineDynamicStateCreateFlags.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPipelineDynamicStateCreateFlags get(int i){
            return new VulkanPipelineDynamicStateCreateFlags(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPipelineDynamicStateCreateFlags.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPipelineDynamicStateCreateFlags.Pointer());
        }

        public Pointer(long value) {
            this(new VkPipelineDynamicStateCreateFlags.Pointer(value));
        }

        @Override
        public VkPipelineDynamicStateCreateFlags.Pointer getVk(){
            return (VkPipelineDynamicStateCreateFlags.Pointer) super.getVk();
        }

        public static class Array extends VulkanPipelineDynamicStateCreateFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineDynamicStateCreateFlags.Pointer> {
            public Array(int count) {
                super(new VkPipelineDynamicStateCreateFlags.Pointer.Array(count));
            }

            public Array(VulkanPipelineDynamicStateCreateFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPipelineDynamicStateCreateFlags.Pointer.Array getVk(){
                return (VkPipelineDynamicStateCreateFlags.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPipelineDynamicStateCreateFlags.Pointer get(int i){
                return new VulkanPipelineDynamicStateCreateFlags.Pointer(getVk().get(i));
            }
        }
    }
}
