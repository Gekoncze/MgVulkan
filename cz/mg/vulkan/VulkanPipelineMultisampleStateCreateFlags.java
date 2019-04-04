package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineMultisampleStateCreateFlags.html">khronos documentation</a>
 **/
public class VulkanPipelineMultisampleStateCreateFlags extends VulkanFlags {
    public VulkanPipelineMultisampleStateCreateFlags(){
        super(new VkPipelineMultisampleStateCreateFlags());
    }

    public VulkanPipelineMultisampleStateCreateFlags(VkPipelineMultisampleStateCreateFlags vk){
        super(vk);
    }

    @Override
    public VkPipelineMultisampleStateCreateFlags getVk(){
        return (VkPipelineMultisampleStateCreateFlags) super.getVk();
    }

    public VulkanPipelineMultisampleStateCreateFlags(int value){
        super(new VkPipelineMultisampleStateCreateFlags(value));
    }

    public static class Array extends VulkanPipelineMultisampleStateCreateFlags implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineMultisampleStateCreateFlags> {
        public Array(VkPipelineMultisampleStateCreateFlags.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPipelineMultisampleStateCreateFlags.Array(count));
        }

        public Array(int count, VulkanPipelineMultisampleStateCreateFlags o){
            this(new VkPipelineMultisampleStateCreateFlags.Array(count, o.getVk()));
        }

        @Override
        public VkPipelineMultisampleStateCreateFlags.Array getVk(){
            return (VkPipelineMultisampleStateCreateFlags.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPipelineMultisampleStateCreateFlags get(int i){
            return new VulkanPipelineMultisampleStateCreateFlags(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPipelineMultisampleStateCreateFlags.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPipelineMultisampleStateCreateFlags.Pointer());
        }

        public Pointer(long value) {
            this(new VkPipelineMultisampleStateCreateFlags.Pointer(value));
        }

        @Override
        public VkPipelineMultisampleStateCreateFlags.Pointer getVk(){
            return (VkPipelineMultisampleStateCreateFlags.Pointer) super.getVk();
        }

        public static class Array extends VulkanPipelineMultisampleStateCreateFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineMultisampleStateCreateFlags.Pointer> {
            public Array(int count) {
                super(new VkPipelineMultisampleStateCreateFlags.Pointer.Array(count));
            }

            public Array(VulkanPipelineMultisampleStateCreateFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPipelineMultisampleStateCreateFlags.Pointer.Array getVk(){
                return (VkPipelineMultisampleStateCreateFlags.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPipelineMultisampleStateCreateFlags.Pointer get(int i){
                return new VulkanPipelineMultisampleStateCreateFlags.Pointer(getVk().get(i));
            }
        }
    }
}
