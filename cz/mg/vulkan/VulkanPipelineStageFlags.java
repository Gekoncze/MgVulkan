package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineStageFlags.html">khronos documentation</a>
 **/
public class VulkanPipelineStageFlags extends VulkanFlags {
    public VulkanPipelineStageFlags(){
        super(new VkPipelineStageFlags());
    }

    public VulkanPipelineStageFlags(VkPipelineStageFlags vk){
        super(vk);
    }

    @Override
    public VkPipelineStageFlags getVk(){
        return (VkPipelineStageFlags) super.getVk();
    }

    public VulkanPipelineStageFlags(int value){
        super(new VkPipelineStageFlags(value));
    }

    public static class Array extends VulkanPipelineStageFlags implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineStageFlags> {
        public Array(VkPipelineStageFlags.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPipelineStageFlags.Array(count));
        }

        public Array(int count, VulkanPipelineStageFlags o){
            this(new VkPipelineStageFlags.Array(count, o.getVk()));
        }

        @Override
        public VkPipelineStageFlags.Array getVk(){
            return (VkPipelineStageFlags.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPipelineStageFlags get(int i){
            return new VulkanPipelineStageFlags(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPipelineStageFlags.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPipelineStageFlags.Pointer());
        }

        public Pointer(long value) {
            this(new VkPipelineStageFlags.Pointer(value));
        }

        @Override
        public VkPipelineStageFlags.Pointer getVk(){
            return (VkPipelineStageFlags.Pointer) super.getVk();
        }

        public static class Array extends VulkanPipelineStageFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineStageFlags.Pointer> {
            public Array(int count) {
                super(new VkPipelineStageFlags.Pointer.Array(count));
            }

            public Array(VulkanPipelineStageFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPipelineStageFlags.Pointer.Array getVk(){
                return (VkPipelineStageFlags.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPipelineStageFlags.Pointer get(int i){
                return new VulkanPipelineStageFlags.Pointer(getVk().get(i));
            }
        }
    }
}
