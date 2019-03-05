package cz.mg.vulkan.jna.structures;

import com.sun.jna.Structure;
import com.sun.jna.Pointer;
import java.util.Arrays;
import java.util.List;
import cz.mg.vulkan.jna.types.*;
import cz.mg.vulkan.jna.structures.*;
import cz.mg.vulkan.jna.flags.*;
import cz.mg.vulkan.jna.enums.*;
import cz.mg.vulkan.jna.handles.*;


/**
 *  typedef struct VkStencilOpState {
 *      VkStencilOp    failOp;
 *      VkStencilOp    passOp;
 *      VkStencilOp    depthFailOp;
 *      VkCompareOp    compareOp;
 *      uint32_t       compareMask;
 *      uint32_t       writeMask;
 *      uint32_t       reference;
 *  } VkStencilOpState;
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkStencilOpState.html">khronos documentation</a>
 **/
public class VkStencilOpState extends Structure {
    public VkStencilOp failOp;
    public VkStencilOp passOp;
    public VkStencilOp depthFailOp;
    public VkCompareOp compareOp;
    public uint32_t compareMask;
    public uint32_t writeMask;
    public uint32_t reference;

    public VkStencilOpState() {
    }

    public VkStencilOpState(Pointer p) {
        super(p);
    }

    @Override
    protected List<String> getFieldOrder() {
        return Arrays.asList(new String[]{
                "failOp",
                "passOp",
                "depthFailOp",
                "compareOp",
                "compareMask",
                "writeMask",
                "reference"
        });
    }

    public ByReference byReference(boolean write, boolean read){
        if(write) write();
        ByReference reference = new ByReference(getPointer());
        if(read) reference.read();
        return reference;
    }

    public ByValue byValue(boolean write, boolean read){
        if(write) write();
        ByValue value = new ByValue(getPointer());
        if(read) value.read();
        return value;
    }

    public static class ByReference extends VkStencilOpState implements Structure.ByReference {
        public ByReference(){
        }

        public ByReference(Pointer pointer){
            super(pointer);
        }
    }

    public static class ByValue extends VkStencilOpState implements Structure.ByValue {
        public ByValue(){
        }

        public ByValue(Pointer pointer){
            super(pointer);
        }
    }
}
