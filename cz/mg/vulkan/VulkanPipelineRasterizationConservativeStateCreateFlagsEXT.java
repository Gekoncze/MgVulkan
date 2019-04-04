package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineRasterizationConservativeStateCreateFlagsEXT.html">khronos documentation</a>
 **/
public class VulkanPipelineRasterizationConservativeStateCreateFlagsEXT extends VulkanFlags {
    public VulkanPipelineRasterizationConservativeStateCreateFlagsEXT(){
        super(new VkPipelineRasterizationConservativeStateCreateFlagsEXT());
    }

    public VulkanPipelineRasterizationConservativeStateCreateFlagsEXT(VkPipelineRasterizationConservativeStateCreateFlagsEXT vk){
        super(vk);
    }

    @Override
    public VkPipelineRasterizationConservativeStateCreateFlagsEXT getVk(){
        return (VkPipelineRasterizationConservativeStateCreateFlagsEXT) super.getVk();
    }

    public VulkanPipelineRasterizationConservativeStateCreateFlagsEXT(int value){
        super(new VkPipelineRasterizationConservativeStateCreateFlagsEXT(value));
    }

    public static class Array extends VulkanPipelineRasterizationConservativeStateCreateFlagsEXT implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineRasterizationConservativeStateCreateFlagsEXT> {
        public Array(VkPipelineRasterizationConservativeStateCreateFlagsEXT.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPipelineRasterizationConservativeStateCreateFlagsEXT.Array(count));
        }

        public Array(int count, VulkanPipelineRasterizationConservativeStateCreateFlagsEXT o){
            this(new VkPipelineRasterizationConservativeStateCreateFlagsEXT.Array(count, o.getVk()));
        }

        @Override
        public VkPipelineRasterizationConservativeStateCreateFlagsEXT.Array getVk(){
            return (VkPipelineRasterizationConservativeStateCreateFlagsEXT.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPipelineRasterizationConservativeStateCreateFlagsEXT get(int i){
            return new VulkanPipelineRasterizationConservativeStateCreateFlagsEXT(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPipelineRasterizationConservativeStateCreateFlagsEXT.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPipelineRasterizationConservativeStateCreateFlagsEXT.Pointer());
        }

        public Pointer(long value) {
            this(new VkPipelineRasterizationConservativeStateCreateFlagsEXT.Pointer(value));
        }

        @Override
        public VkPipelineRasterizationConservativeStateCreateFlagsEXT.Pointer getVk(){
            return (VkPipelineRasterizationConservativeStateCreateFlagsEXT.Pointer) super.getVk();
        }

        public static class Array extends VulkanPipelineRasterizationConservativeStateCreateFlagsEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineRasterizationConservativeStateCreateFlagsEXT.Pointer> {
            public Array(int count) {
                super(new VkPipelineRasterizationConservativeStateCreateFlagsEXT.Pointer.Array(count));
            }

            public Array(VulkanPipelineRasterizationConservativeStateCreateFlagsEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPipelineRasterizationConservativeStateCreateFlagsEXT.Pointer.Array getVk(){
                return (VkPipelineRasterizationConservativeStateCreateFlagsEXT.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPipelineRasterizationConservativeStateCreateFlagsEXT.Pointer get(int i){
                return new VulkanPipelineRasterizationConservativeStateCreateFlagsEXT.Pointer(getVk().get(i));
            }
        }
    }
}
