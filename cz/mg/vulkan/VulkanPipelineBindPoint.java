package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineBindPoint.html">khronos documentation</a>
 **/
public class VulkanPipelineBindPoint extends VulkanEnum {
    public static final int GRAPHICS = VkPipelineBindPoint.VK_PIPELINE_BIND_POINT_GRAPHICS;
    public static final int COMPUTE = VkPipelineBindPoint.VK_PIPELINE_BIND_POINT_COMPUTE;

    public VulkanPipelineBindPoint(){
        super(new VkPipelineBindPoint());
    }

    public VulkanPipelineBindPoint(VkPipelineBindPoint vk){
        super(vk);
    }

    @Override
    public VkPipelineBindPoint getVk(){
        return (VkPipelineBindPoint) super.getVk();
    }

    public VulkanPipelineBindPoint(int value){
        super(new VkPipelineBindPoint(value));
    }

    @Override
    public String toString() {
        if(getValue() == GRAPHICS) return "GRAPHICS";
        if(getValue() == COMPUTE) return "COMPUTE";
        return "UNKNOWN";
    }

    public static class Array extends VulkanPipelineBindPoint implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineBindPoint> {
        public Array(VkPipelineBindPoint.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPipelineBindPoint.Array(count));
        }

        public Array(int count, VulkanPipelineBindPoint o){
            this(new VkPipelineBindPoint.Array(count, o.getVk()));
        }

        @Override
        public VkPipelineBindPoint.Array getVk(){
            return (VkPipelineBindPoint.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPipelineBindPoint get(int i){
            return new VulkanPipelineBindPoint(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPipelineBindPoint.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPipelineBindPoint.Pointer());
        }

        public Pointer(long value) {
            this(new VkPipelineBindPoint.Pointer(value));
        }

        @Override
        public VkPipelineBindPoint.Pointer getVk(){
            return (VkPipelineBindPoint.Pointer) super.getVk();
        }

        public static class Array extends VulkanPipelineBindPoint.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineBindPoint.Pointer> {
            public Array(int count) {
                super(new VkPipelineBindPoint.Pointer.Array(count));
            }

            public Array(VulkanPipelineBindPoint[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPipelineBindPoint.Pointer.Array getVk(){
                return (VkPipelineBindPoint.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPipelineBindPoint.Pointer get(int i){
                return new VulkanPipelineBindPoint.Pointer(getVk().get(i));
            }
        }
    }
}
