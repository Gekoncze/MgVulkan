package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineCoverageToColorStateCreateFlagsNV.html">khronos documentation</a>
 **/
public class VulkanPipelineCoverageToColorStateCreateFlagsNV extends VulkanFlags {
    public VulkanPipelineCoverageToColorStateCreateFlagsNV(){
        super(new VkPipelineCoverageToColorStateCreateFlagsNV());
    }

    public VulkanPipelineCoverageToColorStateCreateFlagsNV(VkPipelineCoverageToColorStateCreateFlagsNV vk){
        super(vk);
    }

    @Override
    public VkPipelineCoverageToColorStateCreateFlagsNV getVk(){
        return (VkPipelineCoverageToColorStateCreateFlagsNV) super.getVk();
    }

    public VulkanPipelineCoverageToColorStateCreateFlagsNV(int value){
        super(new VkPipelineCoverageToColorStateCreateFlagsNV(value));
    }

    public static class Array extends VulkanPipelineCoverageToColorStateCreateFlagsNV implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineCoverageToColorStateCreateFlagsNV> {
        public Array(VkPipelineCoverageToColorStateCreateFlagsNV.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPipelineCoverageToColorStateCreateFlagsNV.Array(count));
        }

        public Array(int count, VulkanPipelineCoverageToColorStateCreateFlagsNV o){
            this(new VkPipelineCoverageToColorStateCreateFlagsNV.Array(count, o.getVk()));
        }

        @Override
        public VkPipelineCoverageToColorStateCreateFlagsNV.Array getVk(){
            return (VkPipelineCoverageToColorStateCreateFlagsNV.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPipelineCoverageToColorStateCreateFlagsNV get(int i){
            return new VulkanPipelineCoverageToColorStateCreateFlagsNV(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPipelineCoverageToColorStateCreateFlagsNV.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPipelineCoverageToColorStateCreateFlagsNV.Pointer());
        }

        public Pointer(long value) {
            this(new VkPipelineCoverageToColorStateCreateFlagsNV.Pointer(value));
        }

        @Override
        public VkPipelineCoverageToColorStateCreateFlagsNV.Pointer getVk(){
            return (VkPipelineCoverageToColorStateCreateFlagsNV.Pointer) super.getVk();
        }

        public static class Array extends VulkanPipelineCoverageToColorStateCreateFlagsNV.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineCoverageToColorStateCreateFlagsNV.Pointer> {
            public Array(int count) {
                super(new VkPipelineCoverageToColorStateCreateFlagsNV.Pointer.Array(count));
            }

            public Array(VulkanPipelineCoverageToColorStateCreateFlagsNV[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPipelineCoverageToColorStateCreateFlagsNV.Pointer.Array getVk(){
                return (VkPipelineCoverageToColorStateCreateFlagsNV.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPipelineCoverageToColorStateCreateFlagsNV.Pointer get(int i){
                return new VulkanPipelineCoverageToColorStateCreateFlagsNV.Pointer(getVk().get(i));
            }
        }
    }
}
