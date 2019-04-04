package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkVertexInputRate.html">khronos documentation</a>
 **/
public class VulkanVertexInputRate extends VulkanEnum {
    public static final int VERTEX = VkVertexInputRate.VK_VERTEX_INPUT_RATE_VERTEX;
    public static final int INSTANCE = VkVertexInputRate.VK_VERTEX_INPUT_RATE_INSTANCE;

    public VulkanVertexInputRate(){
        super(new VkVertexInputRate());
    }

    public VulkanVertexInputRate(VkVertexInputRate vk){
        super(vk);
    }

    @Override
    public VkVertexInputRate getVk(){
        return (VkVertexInputRate) super.getVk();
    }

    public VulkanVertexInputRate(int value){
        super(new VkVertexInputRate(value));
    }

    @Override
    public String toString() {
        if(getValue() == VERTEX) return "VERTEX";
        if(getValue() == INSTANCE) return "INSTANCE";
        return "UNKNOWN";
    }

    public static class Array extends VulkanVertexInputRate implements cz.mg.collections.array.ReadonlyArray<VulkanVertexInputRate> {
        public Array(VkVertexInputRate.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkVertexInputRate.Array(count));
        }

        public Array(int count, VulkanVertexInputRate o){
            this(new VkVertexInputRate.Array(count, o.getVk()));
        }

        @Override
        public VkVertexInputRate.Array getVk(){
            return (VkVertexInputRate.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanVertexInputRate get(int i){
            return new VulkanVertexInputRate(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkVertexInputRate.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkVertexInputRate.Pointer());
        }

        public Pointer(long value) {
            this(new VkVertexInputRate.Pointer(value));
        }

        @Override
        public VkVertexInputRate.Pointer getVk(){
            return (VkVertexInputRate.Pointer) super.getVk();
        }

        public static class Array extends VulkanVertexInputRate.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanVertexInputRate.Pointer> {
            public Array(int count) {
                super(new VkVertexInputRate.Pointer.Array(count));
            }

            public Array(VulkanVertexInputRate[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkVertexInputRate.Pointer.Array getVk(){
                return (VkVertexInputRate.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanVertexInputRate.Pointer get(int i){
                return new VulkanVertexInputRate.Pointer(getVk().get(i));
            }
        }
    }
}
