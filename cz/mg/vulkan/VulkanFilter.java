package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkFilter.html">khronos documentation</a>
 **/
public class VulkanFilter extends VulkanEnum {
    public static final int NEAREST = VkFilter.VK_FILTER_NEAREST;
    public static final int LINEAR = VkFilter.VK_FILTER_LINEAR;
    public static final int CUBIC_IMG = VkFilter.VK_FILTER_CUBIC_IMG;

    public VulkanFilter(){
        super(new VkFilter());
    }

    public VulkanFilter(VkFilter vk){
        super(vk);
    }

    @Override
    public VkFilter getVk(){
        return (VkFilter) super.getVk();
    }

    public VulkanFilter(int value){
        super(new VkFilter(value));
    }

    @Override
    public String toString() {
        if(getValue() == NEAREST) return "NEAREST";
        if(getValue() == LINEAR) return "LINEAR";
        if(getValue() == CUBIC_IMG) return "CUBIC_IMG";
        return "UNKNOWN";
    }

    public static class Array extends VulkanFilter implements cz.mg.collections.array.ReadonlyArray<VulkanFilter> {
        public Array(VkFilter.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkFilter.Array(count));
        }

        public Array(int count, VulkanFilter o){
            this(new VkFilter.Array(count, o.getVk()));
        }

        @Override
        public VkFilter.Array getVk(){
            return (VkFilter.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanFilter get(int i){
            return new VulkanFilter(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkFilter.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkFilter.Pointer());
        }

        public Pointer(long value) {
            this(new VkFilter.Pointer(value));
        }

        @Override
        public VkFilter.Pointer getVk(){
            return (VkFilter.Pointer) super.getVk();
        }

        public static class Array extends VulkanFilter.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanFilter.Pointer> {
            public Array(int count) {
                super(new VkFilter.Pointer.Array(count));
            }

            public Array(VulkanFilter[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkFilter.Pointer.Array getVk(){
                return (VkFilter.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanFilter.Pointer get(int i){
                return new VulkanFilter.Pointer(getVk().get(i));
            }
        }
    }
}
