package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineCreateFlags.html">khronos documentation</a>
 **/
public class VulkanPipelineCreateFlags extends VulkanFlags {
    public VulkanPipelineCreateFlags(){
        super(new VkPipelineCreateFlags());
    }

    public VulkanPipelineCreateFlags(VkPipelineCreateFlags vk){
        super(vk);
    }

    @Override
    public VkPipelineCreateFlags getVk(){
        return (VkPipelineCreateFlags) super.getVk();
    }

    public VulkanPipelineCreateFlags(int value){
        super(new VkPipelineCreateFlags(value));
    }

    public static class Array extends VulkanPipelineCreateFlags implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineCreateFlags> {
        public Array(VkPipelineCreateFlags.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPipelineCreateFlags.Array(count));
        }

        public Array(int count, VulkanPipelineCreateFlags o){
            this(new VkPipelineCreateFlags.Array(count, o.getVk()));
        }

        @Override
        public VkPipelineCreateFlags.Array getVk(){
            return (VkPipelineCreateFlags.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPipelineCreateFlags get(int i){
            return new VulkanPipelineCreateFlags(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPipelineCreateFlags.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPipelineCreateFlags.Pointer());
        }

        public Pointer(long value) {
            this(new VkPipelineCreateFlags.Pointer(value));
        }

        @Override
        public VkPipelineCreateFlags.Pointer getVk(){
            return (VkPipelineCreateFlags.Pointer) super.getVk();
        }

        public static class Array extends VulkanPipelineCreateFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineCreateFlags.Pointer> {
            public Array(int count) {
                super(new VkPipelineCreateFlags.Pointer.Array(count));
            }

            public Array(VulkanPipelineCreateFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPipelineCreateFlags.Pointer.Array getVk(){
                return (VkPipelineCreateFlags.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPipelineCreateFlags.Pointer get(int i){
                return new VulkanPipelineCreateFlags.Pointer(getVk().get(i));
            }
        }
    }
}
