package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkChromaLocation.html">khronos documentation</a>
 **/
public class VulkanChromaLocation extends VulkanEnum {
    public static final int COSITED_EVEN = VkChromaLocation.VK_CHROMA_LOCATION_COSITED_EVEN;
    public static final int MIDPOINT = VkChromaLocation.VK_CHROMA_LOCATION_MIDPOINT;
    public static final int COSITED_EVEN_KHR = VkChromaLocation.VK_CHROMA_LOCATION_COSITED_EVEN_KHR;
    public static final int MIDPOINT_KHR = VkChromaLocation.VK_CHROMA_LOCATION_MIDPOINT_KHR;

    public VulkanChromaLocation(){
        super(new VkChromaLocation());
    }

    public VulkanChromaLocation(VkChromaLocation vk){
        super(vk);
    }

    @Override
    public VkChromaLocation getVk(){
        return (VkChromaLocation) super.getVk();
    }

    public VulkanChromaLocation(int value){
        super(new VkChromaLocation(value));
    }

    @Override
    public String toString() {
        if(getValue() == COSITED_EVEN) return "COSITED_EVEN";
        if(getValue() == MIDPOINT) return "MIDPOINT";
        if(getValue() == COSITED_EVEN_KHR) return "COSITED_EVEN_KHR";
        if(getValue() == MIDPOINT_KHR) return "MIDPOINT_KHR";
        return "UNKNOWN";
    }

    public static class Array extends VulkanChromaLocation implements cz.mg.collections.array.ReadonlyArray<VulkanChromaLocation> {
        public Array(VkChromaLocation.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkChromaLocation.Array(count));
        }

        public Array(int count, VulkanChromaLocation o){
            this(new VkChromaLocation.Array(count, o.getVk()));
        }

        @Override
        public VkChromaLocation.Array getVk(){
            return (VkChromaLocation.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanChromaLocation get(int i){
            return new VulkanChromaLocation(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkChromaLocation.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkChromaLocation.Pointer());
        }

        public Pointer(long value) {
            this(new VkChromaLocation.Pointer(value));
        }

        @Override
        public VkChromaLocation.Pointer getVk(){
            return (VkChromaLocation.Pointer) super.getVk();
        }

        public static class Array extends VulkanChromaLocation.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanChromaLocation.Pointer> {
            public Array(int count) {
                super(new VkChromaLocation.Pointer.Array(count));
            }

            public Array(VulkanChromaLocation[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkChromaLocation.Pointer.Array getVk(){
                return (VkChromaLocation.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanChromaLocation.Pointer get(int i){
                return new VulkanChromaLocation.Pointer(getVk().get(i));
            }
        }
    }
}
