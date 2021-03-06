package nl.dgoossens.chiselsandbits2.common.chiseledblock.iterators.chisel;

import net.minecraft.util.Direction;
import net.minecraft.util.math.AxisAlignedBB;
import nl.dgoossens.chiselsandbits2.common.chiseledblock.voxel.IntegerBox;
import nl.dgoossens.chiselsandbits2.common.chiseledblock.voxel.VoxelBlob;

/**
 * An iterator over an area that can be chiseled.
 */
public interface ChiselIterator {
    /**
     * Get the integer box around this iterator.
     */
    IntegerBox getVoxelBox(VoxelBlob blobAt, boolean b);

    /**
     * Get the bounding box around this iterator.
     */
    AxisAlignedBB getBoundingBox(VoxelBlob NULL_BLOB, boolean b);

    /**
     * Get the block side this iterator is based on.
     */
    Direction side();

    /**
     * Get the x position of the current step.
     */
    int x();

    /**
     * Get the y position of the current step.
     */
    int y();

    /**
     * Get the z position of the current step.
     */
    int z();

    /**
     * Moves to the next step.
     * @return False if there are no more steps.
     */
    boolean hasNext();
}
